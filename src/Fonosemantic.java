

import java.util.ArrayList;
import java.util.HashMap;

public class Fonosemantic {

	//шкала признаков от 1 до 5 (левый признак<2,5  правый признак> 3,5)
	//хорошее плохое
	//большое маленькое
	//нежное грубое
	//женственное мужественное
	//светлое темное
	//активное пассивное
	//Простой – сложный
	//сильное слабое
	//Горячий – холодный
	//быстрое медленное
	//Веселый – грустный
	//красивое отталкивающее
	//гладкое шероховатое
	//легкое тяжелое
	//безопасное устрашающее
	//величественное низменное
	//яркое тусклое
	//округлое угловатое
	//радостное печальное
	//громкое тихое
	//доброе злое
	//Длинный – короткий 
	//Храбрый – трусливый
	//могучее хилое
	//подвижное медлительное
	
	//средние оценки содержательности звуков
	//1. по шкале веселый - грустный
	static final HashMap <String, Double> vg = new HashMap<>();
	static{
	vg.put("В", 3.0);
	vg.put("С", 3.9);
	vg.put("А", 2.0);
	vg.put("Дм", 2.7);
	vg.put("Ж", 4.0);
	vg.put("Й", 2.8);
	vg.put("Ю", 1.6);
	vg.put("Рм", 3.6);
	vg.put("Ш", 3.5);
	vg.put("Г", 2.8);
	vg.put("И", 2.0);
	vg.put("Пм", 3.6);
	vg.put("Р", 3.0);
	vg.put("Гм", 2.9);
	vg.put("Ё", 2.1);
	vg.put("З", 3.2);
	vg.put("С", 3.2);
	vg.put("Зм", 3.1);
	vg.put("Ц", 3.1);
	vg.put("Э", 2.1);
	vg.put("М", 3.5);
	vg.put("Бм", 3.6);
	vg.put("Хм", 4.1);
	vg.put("К", 3.4);
	vg.put("Тм", 2.9);
	vg.put("Я", 1.9);
	vg.put("Нм", 2.4);
	vg.put("П", 3.5);
	vg.put("Ф", 3.9);
	vg.put("Н", 2.6);
	vg.put("Д", 2.4);
	vg.put("Лм", 1.9);
	vg.put("Ы", 3.7);
	vg.put("Фм", 3.4);
	vg.put("Мм", 3.3);
	vg.put("Зм", 3.2);
	vg.put("Б", 2.6);
	vg.put("У", 2.9);
	vg.put("Км", 3.4);
	vg.put("Х", 3.9);
	vg.put("Л", 2.3);
	vg.put("Т", 3.2);
	vg.put("Е", 1.7);
	vg.put("Ч", 3.0);
	vg.put("Щ", 3.7);
	vg.put("О", 1.9);
	vg.put("Ь", 3.0);
	vg.put("Ъ", 3.0);
	}
	public static final HashMap<String, Double> dz = new HashMap<>(); // оценка звука по шкале доброе-злое
	
	static {
		dz.put("В", 3.8);
		dz.put("С", 3.7);
		dz.put("А", 1.8);
		dz.put("Дм", 4.3);
		dz.put("Ж", 3.0);
		dz.put("Й", 4.1);
		dz.put("Ю", 2.6);
		dz.put("Рм", 3.5);
		dz.put("Ш", 3.3);
		dz.put("Г", 3.9);
		dz.put("И", 2.5);
		dz.put("Пм", 4.6);
		dz.put("Р", 2.5);
		dz.put("Гм", 3.9);
		dz.put("Ё", 2.2);
		dz.put("З", 2.9);
		dz.put("С", 3.6);
		dz.put("Зм", 3.9);
		dz.put("Ц", 4.0);
		dz.put("Э", 2.2);
		dz.put("М", 3.3);
		dz.put("Бм", 3.9);
		dz.put("Хм", 4.0);
		dz.put("К", 4.4);
		dz.put("Тм", 4.3);
		dz.put("Я", 3.0);
		dz.put("Нм", 3.8);
		dz.put("П", 4.4);
		dz.put("Ф", 3.8);
		dz.put("Н", 3.3);
		dz.put("Д", 3.5);
		dz.put("Лм", 3.3);
		dz.put("Ы", 2.2);
		dz.put("Фм", 3.9);
		dz.put("Мм", 4.0);
		dz.put("Зм", 3.4);
		dz.put("Б", 4.8);
		dz.put("У", 1.9);
		dz.put("Км", 4.4);
		dz.put("Х", 3.8);
		dz.put("Л", 3.4);
		dz.put("Т", 4.4);
		dz.put("Е", 2.5);
		dz.put("Ч", 4.1);
		dz.put("Щ", 2.7);
		dz.put("О", 1.7);
		dz.put("Ь", 3.0);
		dz.put("Ъ", 3.0);
	}
	
	//частотность звука
	static final HashMap <String, Double> p = new HashMap<>();
	static{
	p.put("А", 0.049);
	p.put("Б", 0.013);
	p.put("Бм", 0.005);
	p.put("В", 0.028);
	p.put("Вм", 0.011);
	p.put("Г", 0.012);
	p.put("Гм", 0.003);
	p.put("Д", 0.020);
	p.put("Дм", 0.017);
	p.put("Е", 0.050);
	p.put("Ё", 0.050);
	p.put("Ж", 0.008);
	p.put("З", 0.013);
	p.put("Зм", 0.002);
	p.put("И", 0.041);
	p.put("Й", 0.013);
	p.put("К", 0.030);
	p.put("Км", 0.003);
	p.put("Л", 0.020);
	p.put("Лм", 0.017);
	p.put("М", 0.025);
	p.put("Мм", 0.007);
	p.put("Н", 0.040);
	p.put("Нм", 0.024);
	p.put("О", 0.067);
	p.put("П", 0.020);
	p.put("Пм", 0.006);
	p.put("Р", 0.024);
	p.put("Рм", 0.014);
	p.put("С", 0.032);
	p.put("См", 0.017);
	p.put("Т", 0.055);
	p.put("Тм", 0.020);
	p.put("У", 0.017);
	p.put("Ф", 0.002);
	p.put("Фм", 0.001);
	p.put("Х", 0.008);
	p.put("Хм", 0.001);
	p.put("Ц", 0.004);
	p.put("Ч", 0.020);
	p.put("Ш", 0.012);
	p.put("Щ", 0.003);
	p.put("Ы", 0.010);
	p.put("Э", 0.004);
	p.put("Ю", 0.004);
	p.put("Я", 0.013);	
	p.put("Ё", 0.039);
	p.put("Ь", 0.000000001);
	p.put("Ъ", 0.000000001);
	
	p.put("Ау", 0.046);
	p.put("Иу", 0.015);
	p.put("Еу", 0.039);
	p.put("Оу", 0.037);
	p.put("Уу", 0.012);
	p.put("Яу", 0.011);
	p.put("Юу", 0.002);
	p.put("Эу", 0.001);
	p.put("Ыу", 0.006);	
	p.put("*", 0.000001);
	}
	
	//список твердых согласных
	static final ArrayList<Character> ts = new ArrayList<>();
	static{
		ts.add('Б');
		ts.add('В');
		ts.add('Г');
		ts.add('Д');
		ts.add('З');
		ts.add('К');
		ts.add('Л');
		ts.add('М');
		ts.add('Н');
		ts.add('П');
		ts.add('Р');
		ts.add('С');
		ts.add('Т');
		ts.add('Ф');
		ts.add('Х');
		ts.add('Ь');
		ts.add('Ъ');
	}
	//список смягчающих гласных
	static final ArrayList<Character> sg = new ArrayList<>();
	static{
		sg.add('И');
		sg.add('Е');
		sg.add('Ё');
		sg.add('Ю');
		sg.add('Я');
		sg.add('Ь');
	}
	
	//фоносемантический ореол слова
	double fs;
	//средняя оценка содержательности звука
	ArrayList<Double> fi = new ArrayList<>(); 
	//частотность звука в речи
	ArrayList<Double> pi = new ArrayList<>();
	//коэффициент веса звука
	ArrayList<Double> ki = new ArrayList<>();
	
	
	//напечатанное слово
	String word;
	//список звуков из слова
	ArrayList<String> sounds;
	
	public Fonosemantic() {
		
	}

	public double compFunnySad(String word) {
		System.out.println(word);
		word = word.toUpperCase();
		System.out.println(word);
		//создадим массив звуков из введенного слова
		sounds = new ArrayList<>();
		//звукобуква
		String z;
		for(int i=0; i< word.length(); i++){	
			if(word.charAt(i)=='*'){
				System.out.println("ударение");
				//?
				
			}else
			//если твердая согласная, а следующая смягчающая гласная
			if(i<word.length()-1 && ts.contains(word.charAt(i)) && sg.contains(word.charAt(i+1))){
				System.out.println("мягкая");	
				z = word.charAt(i)+"м";
				sounds.add(z);	
				//иначе звукобуква такая же как буква
			}else{
				z = ""+word.charAt(i);
				sounds.add(z);	
			}
		//System.out.println(sounds.get(i));			
		}
		
		//заполняем список веса звукобукв по шкале "веселый-грустный"
		for(int i=0; i< sounds.size(); i++){
			fi.add(vg.get(sounds.get(i)));
			System.out.println(fi.get(i) + " fi");
		}
		
		//заполняем список частот звукобукв
		for(int i=0; i< pi.size(); i++){
			//проверяем ударную
			if(i != sounds.size() - 1 &&word.charAt(i+1)=='*'){
				String gud = word.charAt(i)+"у";
				pi.add(p.get(gud));
			}else
				if (word.charAt(i) != '*') {
					System.out.println(word.charAt(i));
					System.out.println(word.charAt(i) + " " +sounds.get(i));
					System.out.println(word.charAt(i) + " " + p.get(sounds.get(i)));
					pi.add(p.get(sounds.get(i)));
					System.out.println(pi.get(i) + " pi");
				}
		}
		
	double pm=0;
	//находим максимальную частоту
	System.out.println("максимальная частота");
	for(int i=0; i< pi.size(); i++){
		System.out.println(pi.get(i) + " pi2");
		if(pm<pi.get(i)){
		pm=pi.get(i);
		}
	}
	System.out.println(pm + " pm");
	
	ArrayList<Double> pmpi = new ArrayList<>();
	//находим отнощение частот
	System.out.println("отношение частот");
	for(int i=0; i< pi.size(); i++){
		if (pi.get(i) != 0.0 && pi.get(i) != 0.0) {
		pmpi.add(pm/pi.get(i));
		System.out.println(pmpi.get(i) + " pmpi");
		}
	}
	
	//находим коэффициенты ki и их сумму
	System.out.println("коэффициенты " + pmpi.size());
	double sumKi=0;
	for(int i=0; i< Math.min(sounds.size() - 1, ki.size() - 1); i++){ 
		//первый звук *4
		if(i==0 && sounds.size() == pmpi.size()){
			ki.add(pmpi.get(i)*4);
		}
		//ударный звук *2
		else if(word.charAt(i+1)=='*'){
			ki.add(pmpi.get(i)*2);
		}else{
			ki.add(pmpi.get(i)); 
		}
		sumKi+=ki.get(i);
		System.out.println(ki.get(i));
	}
	
	//находим произведение fiki
	ArrayList<Double> fiki = new ArrayList<>();
	double sumFiKi=0;
	for(int i=0; i< Math.min(ki.size(), Math.min(fi.size(), sounds.size())); i++){
		fiki.add(ki.get(i)*fi.get(i));
		sumFiKi+=fiki.get(i);
	}
	
	//фоносемантический ореол слова по шкале "веселый-грустный"
	double fs = sumFiKi/sumKi;
	System.out.println(fs);
	return fs;
}
}
