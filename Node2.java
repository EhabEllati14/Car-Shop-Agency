package application;

public class Node2 implements Comparable<Node2>{
	private Node2 next,previouis;
	private SingleList single;
	private String brand;
	
	Node2(){
		
	}
	Node2(String brand){
		this.brand=brand;
		single=new SingleList();
	}
	public Node2 getNext() {
		return next;
	}
	public Node2 getPrevious() {
		return previouis;
	}
	public SingleList getSingle() {
		return single;
	}
	public void setNext(Node2 next) {
		this.next = next;
	}
	public void setPrevious(Node2 previouis) {
		this.previouis = previouis;
	}
	public void setSingle(SingleList single) {
		this.single = single;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "The Brand : "+brand;
	}
	@Override
	public int compareTo(Node2 o) {
		return this.brand.compareTo(o.brand);
		
	}
}
