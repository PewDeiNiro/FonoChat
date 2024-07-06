package chatbot;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Graph {
	boolean added = false;
	BarChart<String, Number> graphic;
	XYChart.Series<String, Number> funny, sad, neitral;
	CategoryAxis ca;
	NumberAxis na;
	
	//TODO Подписать ось "Фоносемантический ореол", Изменить цвета графиков
	
	public Graph(BarChart<String, Number> graphic) {
		this.graphic = graphic;
		ca = new CategoryAxis();
		ca.setLabel("Текущее сообщение");
		
		na = new NumberAxis();
		na.setLabel("Настроение");
		
		graphic.setTitle("Эмоции");
		
		funny = new XYChart.Series<>();
		sad = new XYChart.Series<>();
		neitral = new XYChart.Series<>();
		
		funny.setName("Весёлое");
		sad.setName("Грустное");
		neitral.setName("Нейтральное");
		
		neitral.getData().add(new XYChart.Data<String, Number>("Нейтральное", 0));
		funny.getData().add(new XYChart.Data<String, Number>("Весёлое", 0));
		sad.getData().add(new XYChart.Data<String, Number>("Грустное", 0));
		graphic.getData().add(funny);
		graphic.getData().add(sad);
		graphic.getData().add(neitral);

		
	}
	
	public void updateGraph(double[] values) {	
		sad.getData().get(0).setYValue(values[2]);
		funny.getData().get(0).setYValue(values[1]);
		neitral.getData().get(0).setYValue(values[0]);
	}	
	
}
