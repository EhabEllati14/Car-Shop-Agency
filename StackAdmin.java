package application;

public class StackAdmin {
	StackNode first;
	public static int counts=0;
	public static int profit=0;
	
	public void push(String name,String mobile,Car cars,String date,String status,String brand) {
		StackNode newnode= new StackNode(name,mobile,cars,date,status,brand);
		if(first==null) {
			first=newnode;
		}
		else {
			newnode.setNext(first);
			first=newnode;
		}
		counts++;
		profit=(int)(profit+newnode.getCars().getPrice());
	}
	public StackNode pop() {
		StackNode temp=first;
		if(first==null) {
			System.out.println("The Stack is empty!!");
			counts--;
			return null;
		}
		else {
			first=first.getNext();
			temp.setNext(null);
			counts--;
		}
		profit=(int)(profit-temp.getCars().getPrice());
		return temp;
		
	}
	
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}
		else {
			return false;
		}
	}

}
