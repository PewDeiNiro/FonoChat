package chatbot;


import java.io.IOException;
import java.util.ArrayList;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	TextArea chat;
	@FXML
	TextField message;
	@FXML
	BarChart<String, Number> graphic;
	
	Graph graph;
	
	//средние значения эмоций
	double[] values;
	
	Fonosemantic fn = new Fonosemantic();
	
	//TODO запись в текстовый файл результатов расчетов(log.txt), DONE
	//TODO написать алгоритм ответа чатбота  в зависимости от эмоций DONE
	
	public void send(ActionEvent event) { 
			
		String msg = message.getText();
		
			System.out.println(msg);
			chat.appendText("Вы: " + msg + "\n");
			
		values = analizeText(msg);		
		if (graph == null) {
			graph = new Graph(graphic);
		}
		graph.updateGraph(values);
	
		msg = setUdar(msg);
		
		System.out.println(msg);
		
		
		double middleValue;
		if (values[1] != 0.0 && values[2] != 0.0) {
			if (Math.abs(3.0 - values[2]) > Math.abs(3.0 - values[1])) {
				middleValue = values[2];
			}
			else {
				middleValue = values[1];
			}
		}
		else if (values[1] != 0.0 || values[2] != 0.0) {
			middleValue = values[1] + values[2]; // одно из них равно 0
		}
		else {
			middleValue = values[0];
		}
		
		//ответ чат-бота
		chat.appendText("Чат-Бот: " +Main.chatBot.getAnswer(deleteChars(msg).toLowerCase(), middleValue) + "\n");
		message.requestFocus();		
	}
	
	// получает среднее значение предложения
	public double getMiddleValue(String str) {
		
			System.out.println("getMiddleValue");
		
		String[] words = str.split(" ");
		double[] values = new double[words.length];
		for (int i = 0; i < words.length; i++) {
			values[i] = fn.compFunnySad(checkUdar(words[i]) ? words[i] : setUdar(words[i]));
		}
		double sumValues = 0;
		for (int i = 0; i < values.length; i++) {
			sumValues = sumValues + values[i];
		}
		return sumValues / values.length;
	}
	
	//разбивает предложение на 3 коэффициента: неётральный, весёлый и грустный
	public double[] analizeText(String text) {	
		//массив с значениями предложения
		
			System.out.println("analizeText");
		
		double[] values = new double[3];
		
		//неётральные значения
		ArrayList<Double> neitral = new ArrayList<>();
		//весёлые значения
		ArrayList<Double> funny = new ArrayList<>();
		//грустные значения
		ArrayList<Double> sad = new ArrayList<>();
		
		//обработка предложения по словам
		for (String temp : text.split(" ")) {
			double tempFn = fn.compFunnySad(setUdar(temp));
			if (tempFn <= 2.5) {
				funny.add(tempFn);
			}
			else if (tempFn >= 3.5) {
				sad.add(tempFn);
			}
			else {
				neitral.add(tempFn);
			}
		}
		//суммы соответствующих настроений
		double sumSad = 0;
		double sumFunny = 0;
		double sumNeitral = 0;
		
		for (int i = 0; i < sad.size(); i++) {
			sumSad = sumSad + sad.get(i);
		}
		
		for (int i = 0; i < neitral.size(); i++) {
			sumNeitral = sumNeitral + neitral.get(i);
		}
		
		for (int i = 0; i < funny.size(); i++) {
			sumFunny = sumFunny + funny.get(i);
		}
		
			System.out.println(sumSad + "");
		
		values[0] = neitral.size() != 0 ? sumNeitral / neitral.size() : 0;
		values[1] = funny.size() != 0 ? sumFunny / funny.size() : 0;
		values[2] = sad.size() != 0 ? sumSad / sad.size() : 0;
		
		return values;
	}
	
	//метод ставящий ударение (проблема)
	public String setUdar(String word) {
		
			System.out.println("setUdar " + word + " входимое слово"); 
		
		final char[] glasn = {'а', 'е', 'ё', 'у', 'ы', 'о', 'э', 'я', 'ю', 'и'};
		String finalRes = "";
		String[] words = word.split(" ");
		boolean settedUdar = false;
		for (int i = 0; i < word.length(); i++) {
			if (contains(glasn, word.charAt(i)) && !(settedUdar)) {
				finalRes = finalRes + word.charAt(i) + "*";
				settedUdar = true;
			}
			else {
				finalRes = finalRes + word.charAt(i);
			}
		}
		
		/*for (String temp : words) {
			System.out.println(temp + " подписано");
		} 
		for (String temp : words) { // в каждом слове будет ставиться ударение
			boolean settedUdar = false; // поставлено ли ударение в этом слове
			for (int i = 0; i < temp.length(); i++) {
				if (contains(glasn, word.charAt(i)) && !settedUdar) { // если в этом слове не поставлено ударение и попалась гласная
					finalRes = finalRes + word.charAt(i) + "*"; //ставиться ударение
					settedUdar = true;
				}
				else {
					finalRes = finalRes + word.charAt(i);
				}
				System.out.println(finalRes);
			}
		}*/
		return finalRes;
	}
	
	public boolean contains(char[] array, char key) {
		for (char element : array) {
			if (element == key) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkUdar(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == '*') {
				return true;
			}
		}
		return false;
	}
	
	// метод удаляющий знаки препинания
	public String deleteChars(String word) {
		
			System.out.println("deleteChars");
		
		String[] abc = new String[]{"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", 
				"к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
				"х", "ц", "ч", "ш", "щ", "ь", "ы", "ъ", "э", "ю", "я"}; // русский алфавит
		String result = "";
		word = word.toLowerCase();
		String[] array = word.split("");
		for (String temp : array) {
			if (checkElement(abc, temp)) {
				result = result + temp;
			}
		}
		return result;
	}
	
	//да знаю плохое решение
	public String deleteCharsWithoutProbels(String word) {
		
			System.out.println("deleteCharsWithoutProbels");
		
		String[] abc = new String[]{"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", 
				"к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
				"х", "ц", "ч", "ш", "щ", "ь", "ы", "ъ", "э", "ю", "я", " "}; // русский алфавит
		String result = "";
		word = word.toLowerCase();
		String[] array = word.split("");
		for (String temp : array) {
			if (checkElement(abc, temp)) {
				result = result + temp;
			}
		}
		return result;
	}
	
	public boolean checkElement(String[] array, String element) {
		for (String temp : array) {
			if (temp.equals(element)) {
				return true;
			}
		}
		return false;
	}
	
}
