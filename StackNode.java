package application;

public class StackNode {
	private String name;
	private String mobile;
	private Car cars;
	private String date;
	private String status;
	private String brand;

	StackNode next;
	
	StackNode(String name,String mobile,Car cars,String date,String status,String brand){
		this.name=name;
		this.mobile=mobile;
		this.cars=cars;
		this.date=date;
		this.status=status;
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	public Car getCars() {
		return cars;
	}

	public String getDate() {
		return date;
	}

	public String getStatus() {
		return status;
	}

	public StackNode getNext() {
		return next;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setCars(Car cars) {
		this.cars = cars;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setNext(StackNode next) {
		this.next = next;
	}
	

}
