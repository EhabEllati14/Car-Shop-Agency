package application;

public class QueueNode {
	private String name;
	private String mobile;
	private Car cars;
	private String Date;
	private String Status;
	private String brand;

	QueueNode next;
	
	QueueNode(String name, String mobile , Car cars, String date , String status,String brand){
		this.name=name;
		this.mobile=mobile;
		this.cars=cars;
		this.Date=date;
		this.Status=status;
		this.brand=brand;
		}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
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

	public QueueNode getNext() {
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

	public void setNext(QueueNode next) {
		this.next = next;
	}

	
	


}
