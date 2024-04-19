package application;

public class DoubleList extends Main {
	Node2 firstd=null;
	Node2 last=null;
	int countd = 0;
	
	public Node2 getFirst() {
		if (countd == 0)
			return null;
		else
			return firstd;
	}
    // return the last node in the list
	public Node2 getLast() {
		if (countd == 0)
			return null;
		else
			return last;
	}
 // we want to add from first
	public void addFirst(String L ,Car m) {
		Node2 newn = new Node2(L);
		newn.getSingle().add(m);
		if (countd == 0) {
			firstd = last = newn;
			newn.setNext(firstd);
			newn.setPrevious(firstd);
		
		} else {
			newn.setNext(firstd);
			newn.setPrevious(last);
			firstd.setPrevious(newn);
			last.setNext(newn);
			firstd = newn;
		}
		countd++;
	}
	// add first but add a locate only
	public void addFirstL(String L) {
		Node2 newn = new Node2(L);
		if (countd == 0) {
			firstd = last = newn;
			newn.setNext(firstd);
			newn.setPrevious(firstd);
		
		} else {
			newn.setNext(firstd);
			newn.setPrevious(last);
			firstd.setPrevious(newn);
			last.setNext(newn);
			firstd = newn;
		}
		countd++;
	}
	
	
// add locate from the last of the list
	public void addLast(String L, Car m) {
		Node2 newn = new Node2(L);
		newn.getSingle().add(m);
		if (countd == 0) {
			firstd = last = newn;
		} else {
			newn.setNext(firstd);
			newn.setPrevious(last);
			last.setNext(newn);
			firstd.setPrevious(newn);
			last = newn;
		}
		countd++;
	}
	
	
	public void addLastL(String L) {
		Node2 newn = new Node2(L);
		if (countd == 0) {
			firstd = last = newn;
		} else {
			newn.setNext(firstd);
			newn.setPrevious(last);
			last.setNext(newn);
			firstd.setPrevious(newn);
			last = newn;
		}
		countd++;
	}
	public void Update(String brand ,Node2 n) {
		// we store n in node b
		Node2 b=n;
		Node1 r= b.getSingle().getFirst();
		remove(n.getBrand());
			for(int i=1;i<=b.getSingle().count;i++) {
			add(brand,r.getCars());
			r=r.getNext();
			}
		}
	
	
	// here  if we want to add a locate but we add with it the martyr
	
	public void add(String Brand, Car m ,int index) {
		Node2 newn = new Node2(Brand);
		newn.getSingle().add(m);
		if (index == 0) {
			addFirst(Brand,m);
		} else if (index >=countd) {
			addLast(Brand,m);
			}
		else {
			Node2 current = firstd;
			for (int i = 0; i < index - 1; i++) {    //o(n) --> because we go to the index 
				current = current.getNext();
			}
			newn.setNext(current.getNext());
			newn.setPrevious(current);
			current.setNext(newn);
			(current.getNext()).getNext().setPrevious(newn);
			countd++;
		}
	}
	// add location at some index
	public void add(String Brand,int index) {
		Node2 newn = new Node2(Brand);
		
		if (index == 0) {
			addFirstL(Brand);
		} else if (index >=countd) {
			addLastL(Brand);
			}
		else {
			Node2 current = firstd;
			for (int i = 0; i < index - 1; i++) { //o(n) --> we stop to the n index
				current = current.getNext();
			}
			newn.setNext(current.getNext());
			newn.setPrevious(current);
			current.setNext(newn);
			(current.getNext()).getNext().setPrevious(newn);
			countd++;
		}
	}	
	
	
	// this method to add locate and martyrs to the list 
	// in this method we sort and remove the deplicated names from location 

	public void add(String Brand,Car m) {
		Node2 cur = firstd;
		Node2 f =null;
		int index=0;
		// we create 2 variables 
		//index--> for the add to add in this index by sorting
		// we use a flag to know if the location is in the list or not
		int flag=0;
		for(int i=0;i<countd;i++) {
			if(Brand.compareTo(cur.getBrand())>0) {// use the compare to method
				cur=cur.getNext();
				++index;
			}
			else if(Brand.compareTo(cur.getBrand())==0) {
				flag=1;
				 f =cur;
				break;
					}
		
			else {
				cur=cur.getNext();
			}
		}
		if(flag==0) {
		add(Brand,m,index);
		//l.getTabel().setItems((ObservableList) m);
	
		}
		else {
			f.getSingle().add(m);	
		}
		}
	
	// add location only
	
	public void add(String Brand) {
		Node2 cur = firstd;
		int index=0;
		int flag=0;
		for(int i=0;i<countd;i++) {
			if(Brand.compareTo(cur.getBrand())>0) {
				cur=cur.getNext();
				++index;
			}
			else if(Brand.compareTo(cur.getBrand())==0) {
				flag=1;
               
				break;
					}
			else {
				cur=cur.getNext();
			}
		}
		if(flag==0) {
		add(Brand,index);
		}
		
		}

	
	// update at this node we give it the location 
//	public void Update(String Locate ,Node2 n) {
//		// we store n in node b
//		Node2 b=n;
//		Node1 r= b.getSinglelist().getFirst();
//		remove(n.getLocate());
//			for(int i=1;i<=b.getSinglelist().count;i++) {
//			add(Locate,r.getMartyrs());
//			r=r.getNext();
//			}
//		}
//		
//	// search about string of the martyrs in thi node
//		public String Search(String name,Node2 n) throws NullPointerException {
//			//singleLL list = new singleLL();
//			Node1 b =n.getSinglelist().getFirst();
//			String r="";
//			for(int i=0;i< n.getSinglelist().count;i++) {
//				if(b.getMartyrs().getName().contains(name)) {
//					r=r+"\n"+b.getMartyrs().getName();
//				b=b.getNext();
//				}
//				else {
//					b=b.getNext();
//				}
//			}
//			return r;
//			
//			
//		}
//// this only search by name to return the menu of the names
	
		public Node1 SearchCar(Node2 n,String model,String year,String color, double price) throws NullPointerException {
			Node1 b =n.getSingle().getFirst();
			Node1 r=null;
			for(int i=1;i<= n.getSingle().count;i++) {//o(n)
				if((b.getCars().getModel().trim().equals(model)) && b.getCars().getYear().trim().equals(year)&& b.getCars().getColor().trim().equals(color) && b.getCars().getPrice()==price) {
					r=b;
					break;
				}
				else {
					b=b.getNext();
				}
			}
			return r;
			
		}
		
		
	
// when we want to remove from first
		// we have many cases we must check it

	public void removeFirst() {
		if (countd == 0) {
			System.out.println("The list is Empty!!");

		} else if (countd == 1) {
			firstd = last = null;
		} else {
			Node2 current = firstd;
			firstd = firstd.getNext();
			firstd.setPrevious(last);
			last.setNext(firstd);
			current.setNext(null);
			current.setPrevious(null);

		}
		countd--;
	}

	public void removeLast() {
		if (countd == 0) {
			System.out.println("The list is Empty!!");

		} else if (countd == 1) {
			firstd = last = null;
		} else {
			Node2 current = firstd;
			for (int i = 0; i < countd - 2; i++) {
				current = current.getNext();
			}
			current.setNext(firstd);
			firstd.setPrevious(current);
			last=current;
			
		}
		countd--;
	}

	public void remove(int index) {
		if (index == 0) {
			removeFirst();
		} else if (index == countd - 1) {
			removeLast();
		} else if (index < 0 || index >= countd) {
			throw new IllegalArgumentException("Error : you enter out index number !!");
		} else {
			Node2 current = firstd;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			Node2 temp = current.getNext();
			current.getNext().setPrevious(null);
			current.setNext(current.getNext().getNext());
			current.getNext().setPrevious(current);
			temp.setNext(null);
			countd--;
		}
	}
// if we want to remove some locate
	public void remove(String Brand) {
		try {
		Node2 current=null;
		if (countd != 0) {
			if (Brand.equals(firstd.getBrand())) {
				removeFirst();
			} else if (Brand.equals(last.getBrand())) {
				removeLast();
			} else {
			 current = firstd;
				for (int i = 0; i < countd-1; i++) {
					if (Brand.equals(current.getBrand())) {
						remove(i);
					}
					
					current = current.getNext();
				}
				
			}
		}
		}
		catch(NullPointerException ex) {
			System.out.print("");
		}
	}
	
	
	public Node2 Search (String brand) {
		Node2 curr=firstd;
		Node2 f=null;
		String r=brand.toUpperCase();
	    for(int i=1;i<=countd;i++) {
	    	if(curr.getBrand().contains(r)) {
	    		f=curr;
	    		 break;
	    	}
	    	else {
	    		curr=curr.getNext();
	    	}
	    }
	    return f;
	    
	}
//we use it to printr in the textarea
	public String PrintDoubleList() {
		Node2 current = firstd;
		String r="";

		for (int i = 0; i <countd; i++) {
			r=r+current.getBrand()+", "+current.getSingle().printList();
		//System.out.println(current.getSinglel().printList());
			current = current.getNext();
	}
		return r;
	}
}




