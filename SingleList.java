package application;

import javafx.collections.FXCollections;

public class SingleList {
	Node1 first,last;
	int count=0;
	
	int carcount=0;
	double highprice=0;
	double lowprice=0;
	String highmodel=null;
	String lowmodel=null;

	public double AvgPrice() {
		
		
		Node1 cur = first;
		//cretae variable to calculate the avg!!
		double sum = 0;
		double res;
		for (int i = 1; i <= count; i++) {
			sum = sum + cur.getCars().getPrice();
			cur = cur.getNext();
		}
		res = ((sum * (1.0)) / count);
		return res;
	}
	
	
	
	public int getCarcount() {
		return carcount;
	}



	public double getHighprice() {
		return first.getCars().getPrice();
	}



	public double getLowprice() {

		return last.getCars().getPrice();
	}



	public String getHighmodel() {
		return first.getCars().getModel();
	}



	public String getLowmodel() {
		return last.getCars().getModel();
	}



	public void setCarcount(int carcount) {
		this.carcount = carcount;
	}



	public void setHighprice(double highprice) {
		this.highprice = highprice;
	}



	public void setLowprice(double lowprice) {
		this.lowprice = lowprice;
	}



	public void setHighmodel(String highmodel) {
		this.highmodel = highmodel;
	}



	public void setLowmodel(String lowmodel) {
		this.lowmodel = lowmodel;
	}



	public Node1 getFirst() {
		if (count == 0)
			return null;
		else
			return first;
	}

	public Node1 getLast() {
		if (count == 0)
			return null;
		else
			return last;
	}

	// adds methods add from frist and last 
	public void addFirst(Car cars) {
		if (count == 0)
			first = last = new Node1(cars);
		else {
			Node1 temp = new Node1(cars);
			temp.setNext(first);
			first = temp;
		}
		count++;
		carcount++;
	}

	public void addLast(Car m) {
		if (count == 0)
			first = last = new Node1(m);
		else {
			Node1 temp = new Node1(m);
			last.setNext(temp);
			last = temp;
		}
		count++;
		carcount++;
	}

	// add martyrs in the index
	public void add(Car m, int index) {
		if (index == 0)
			addFirst(m);
		else if (index >= count) {
			addLast(m);
		} else {
			Node1 temp = new Node1(m);
			Node1 current = first;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			temp.setNext(current.getNext());
			current.setNext(temp);
			count++;
			carcount++;
		}
	}

	// add martyrs 
	public void add(Car m) {
		Node1 cur = first;
		int index = 0;
		//first we check the counters to add them 
		//we have some cases if the counter of the list is zero thats mean we dont have any martyrs
		if (count == 0) {
			add(m, index);
		} else {
			while (cur != null) {//o(n)
				// we sort the martyrs by using the compare to method
				if (m.getYear().compareTo(cur.getCars().getYear())<=-1) {
					cur = cur.getNext();
					++index;
				} else {
					cur = cur.getNext();
				}
			}
			// we call the add method after the while loop
			add(m, index);
		}
	}
// removes methods
	public void removeFirst() {
		if (count == 0)
			System.out.println("Error : The list is null !");
		else if (count == 1) {
			first = last = null;
		} else {
			first = first.getNext();
			count--;
			carcount--;
		}
	}

	public void removeLast() {
		if (count == 0) {
			System.out.println("Error : The list is null !");
		}

		else if (count == 1) {
			last = first = null;

		} else {
			Node1 current = first;
			for (int i = 1; i < count - 1; i++) {
				current = current.getNext();
			}
			last = current;
			current.setNext(null);
		}
		count--;
		carcount--;
	}

	public void remove(int index) {
		if (index == 0) {
			removeFirst();
		} else if (index == count - 1) {
			removeLast();
		} else {
			Node1 current = first;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			current.setNext((current.getNext()).getNext());
			count--;
			carcount--;
		}
	}
// if we want to remove a martyurs we want to update on the counters
	public void remove(Car m) {
		//first we check about the counter
		
		if (count != 0) {
			if (m.equals(first.getCars())) {
				removeFirst();
			} else if (m.equals(last.getCars())) {
				removeLast();
			} else {
				Node1 current = first;
				for (int i = 0; i < count - 1; i++) {
					if (m.equals(current.getCars())) {
						remove(i);
					}
					current = current.getNext();
				}
			}
		}
	}
// when we update first we remove the element and ethen we add them
//	public void updatedateadd(Martyrs m) {
//		// store the martyrs before delete them
//		Martyrs c = m;
//		remove(m);
//		add(c);
//	}
// to print the information of each martyrs
	public String printList() {
		Node1 current = first;
		String r=null;
		r="";
		for (int i = 1; i <= count; i++) {
			r =r+ current.getCars().toString();
			r=r+"\n";
			current = current.getNext();
		}
		return r;

	}
	
	public SingleList printsingle() {
		Node1 current = first;
		SingleList s = new SingleList();
		for (int i = 1; i <= count; i++) {
	       s.add(current.getCars());
	       current=current.getNext();
		}
		return s;
	
	}

}



