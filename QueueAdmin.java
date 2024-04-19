package application;

public class QueueAdmin {
	QueueNode front,rear;
	static int count=0;
	
	
	public QueueNode getFront() {
		return front;
	}
	public void enQueueadmin(String name, String mobile,Car cars,String date,String status,String brand) {
		QueueNode newnode= new QueueNode(name,mobile ,cars, date,status,brand);
		if(rear==null) {
			front=rear=newnode;
			rear.setNext(front);
		}
		else {
			rear.setNext(newnode);
			rear=newnode;
			newnode.setNext(front);
		}
		count++;
	}
	
	public QueueNode deQueueadmin() {
		if(front==null) {
			System.out.println("The Queue is null ---------");
			return null;
		}
		else if(front==rear){
			QueueNode temp=front;
			front=rear=null;
			count--;
			return temp;
			
		}
		else {
			 QueueNode temp=front;
				front=front.getNext();
				rear.setNext(front);
				temp.setNext(null);
				count--;
				return temp;
		
		}	
	}
	
	public String PrintQueue() {
		QueueNode temp=null;
		String r="";
		if(front==null && rear==null) {
			System.out.println("The Queue is empty !!");
		}
		else {
			temp=front;
			int c=count;
			while(c>0) {
				
				r=r+temp.getName()+", "+temp.getMobile()+", "+temp.getBrand()+", "+temp.getCars().PrintwithoutBrand()+", "+temp.getDate()+", "+temp.getStatus()+"\n";
				temp=temp.getNext();
				c--;
			}
		}
		return r;
	}
	
	

}
