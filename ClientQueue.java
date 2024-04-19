package application;

public class ClientQueue {
	QueueNode front ,rear;
	static int countc =0;
	
	
	public void enQueue(String name,String mobile,Car cars,String date,String status,String brand) {
		QueueNode newnode= new QueueNode(name,mobile,cars,date,status,brand);
		if(rear==null) {
			front=rear=newnode;
		}
		else {
			rear.setNext(newnode);
			rear=newnode;
		}
		countc++;
	}
	public QueueNode deQueue() {
		if(front==null || rear==null) {
			System.out.println("The Queue is Empty !!");
			return  null;
		}
		else if(front==rear) {	
			QueueNode temp=front;
			countc--;
			front=rear=null;
			return temp;
		}
		else {
			 QueueNode temp=front;
			front=front.getNext();
			temp.setNext(null);
			countc--;
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
		while(temp!=null) {
				r=r+"\n"+temp.getName()+", "+temp.getMobile().toString()+", "+temp.getBrand()+", "+temp.getCars().PrintwithoutBrand()+", "+temp.getDate()+", "+temp.getStatus();
				temp=temp.getNext();
			}
		}
		return r;
	}

}
