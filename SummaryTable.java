package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class SummaryTable {
	private SimpleStringProperty brand;
	private SimpleStringProperty lowestmodel;
	private SimpleStringProperty highmodel;
	private SimpleDoubleProperty rangeprice;
	private SimpleDoubleProperty lowestprice;
	private SimpleDoubleProperty highprice;
	private SimpleDoubleProperty countcar;
	
	SummaryTable(String s1,String s2,String s3,double d1,double d2,double d3,double d4){
		brand= new SimpleStringProperty(s1);
		lowestmodel=new SimpleStringProperty(s2);
		highmodel=new SimpleStringProperty(s3);
		rangeprice=new SimpleDoubleProperty(d1);
		lowestprice=new SimpleDoubleProperty(d2);
		highprice=new SimpleDoubleProperty(d3);
		countcar=new SimpleDoubleProperty(d4);
	}
	public double getCountcar() {
		return countcar.get();
	}

	public void setCountcar(double countcar) {
		this.countcar .set(countcar);
	}

	public String getBrand() {
		return brand.get();
	}

	public String getLowestmodel() {
		return lowestmodel.get();
	}

	public String getHighmodel() {
		return highmodel.get();
	}

	public double getRangeprice() {
		return rangeprice.get();
	}

	public double getLowestprice() {
		return lowestprice.get();
	}

	public double getHighprice() {
		return highprice.get();
	}

	public void setBrand(String r) {
		this.brand.set(r);
	}

	public void setLowestmodel(String r) {
		this.lowestmodel.set(r);
	}

	public void setHighmodel(String r) {
		this.highmodel.set(r);
	}

	public void setRangeprice(double r) {
		this.rangeprice.set(r);
	}

	public void setLowestprice(double r) {
		this.lowestprice.set(r);
	}

	public void setHighprice(double r) {
		this.highprice.set(r);
	}

}
