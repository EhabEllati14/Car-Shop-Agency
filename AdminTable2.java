package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class AdminTable2 {
	private SimpleStringProperty Name;
	private SimpleStringProperty Mobile;
	private SimpleStringProperty Brand;
	private SimpleStringProperty Model;
	private SimpleStringProperty Year;
	private SimpleStringProperty Color;
	private SimpleDoubleProperty Price;
	private SimpleStringProperty Date;
	private SimpleStringProperty Status;

	AdminTable2(String s1, String s2, String s3, String s4, String s5, String s6, double s7, String s8, String s9) {
		Name = new SimpleStringProperty(s1);
		Mobile = new SimpleStringProperty(s2);
		Brand = new SimpleStringProperty(s3);
		Model = new SimpleStringProperty(s4);
		Year = new SimpleStringProperty(s5);
		Color = new SimpleStringProperty(s6);
		Price = new SimpleDoubleProperty(s7);
		Date = new SimpleStringProperty(s8);
		Status = new SimpleStringProperty(s9);
	}

	public String getName() {
		return Name.get();
	}

	public String getMobile() {
		return Mobile.get();
	}

	public String getBrand() {
		return Brand.get();
	}

	public String getDate() {
		return Date.get();
	}

	public String getStatus() {
		return Status.get();
	}

	public void setName(String r) {
		Name.set(r);
	}

	public void setMobile(String r) {
		Mobile.set(r);
	}

	public void setBrand(String r) {
		Brand.set(r);
	}

	public void setDate(String r) {
		Date.set(r);
	}

	public void setStatus(String r) {
		Status.set(r);
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
