package application;

public class Car implements Comparable<Car>{
	private String model;
	private String year;
	private String color;
	private double price;
	Car(){
		
	}
	public Car(String model, String year, String color, double price) {
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public String getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	public double getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Car o) {
	 int a =Integer.parseInt(this.year);
	 int b =Integer.parseInt(o.getYear());
		if(a>b)
			return 1;
		else if(a<b)
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return  Main.cur.getBrand()+", "+model + ", " + year + ", " + color + ", " + price+"K" ;
	}
	public String PrintwithoutBrand() {
		return  model + ", " + year + ", " + color + ", " + price+"K" ;
	}

}
