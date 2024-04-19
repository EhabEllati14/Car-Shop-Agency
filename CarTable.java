package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class CarTable {
	private SimpleStringProperty  Model;
	private SimpleStringProperty Year;
	private SimpleStringProperty Color;
	private SimpleDoubleProperty Price;
	
	
	CarTable(){
		
	}
	public CarTable(String s1,String s2, String s3, double s4) {
		
		Model=new SimpleStringProperty(s1);
		Year=new SimpleStringProperty(s2);
		Color=new SimpleStringProperty(s3);
		Price= new SimpleDoubleProperty(s4);
	}
	
	public String getModel() {
		return Model.get();
	}
	public String getYear() {
		return Year.get();
	}
	public String getColor() {
		return Color.get();
	}
	public double getPrice() {
		return Price.get();
	}
	
	public void setModel(String r) {
		Model.set(r);
	}
	public void setYear(String r) {
		Year.set(r);
	}
	public void setColor(String r) {
		Color.set(r);
	}
	public void setPrice(double r) {
		Price.set(r);
	}	
}
