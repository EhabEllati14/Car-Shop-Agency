package application;

public class Node1 {
	private Car cars;
	private Node1 next;
	
	
	
	Node1() {

	}
	
	Node1(Car cars){
		this.cars=cars;
	}
	
	public Car getCars() {
		return cars;
	}

	public Node1 getNext() {
		return next;
	}

	public void setCars(Car cars) {
		this.cars = cars;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}
}
