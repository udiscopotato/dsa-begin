package linkedList.singlyLinkedList;

//Steps to create SinglyLinkedList

//To enter the first step we need to create a Node class which will carry our physical location and value of every block 

//Step-1  First we need to create head and tail initialized with null;
//Step-2  Create a blank node , assign value to it and reference to null.
//Step-3  Link head and tail with these Node.

class SinglyLinkedList {
	Node head;
	Node tail;
	int size;
	
	Node createSingly(int nodeValue) {
		head=new Node();
		Node node = new Node();
		node.next=null;
		node.value=nodeValue;
		
		head=node;
		tail=node;
		
		size=1;
		
		return head;
	}
	
	// Insert Methods
	void insertFirst(int nodeValue) {
		if(head == null) {
			createSingly(nodeValue);
		}
		Node node = new Node();
		node.value=nodeValue;
		node.next=head;
		head=node;
		size++;
	}
	
	void insertLast(int nodeValue) {
		if(head == null) {
			createSingly(nodeValue);
		}
		Node node = new Node();
		node.value=nodeValue;
		tail.next=node;
		node.next=null;
		tail=node;
		size++;
	}
	
	void insertMiddle(int nodeValue, int location) {
		if(location == 0) {
			insertFirst(nodeValue);
		}else if(location > size) {
			insertLast(nodeValue);
		}
		
		Node node=new Node();
		node.value=nodeValue;
		Node tempNode = head;
		int index=0;
		while(index < location-1) {
			tempNode=tempNode.next;
			index++;
		}
		Node nextNode = tempNode.next;
		tempNode.next=node;
		node.next=nextNode;
		size++;
		
	}
	
	// Traversal Methods
	void displayall() {
		if(head==null) {
			System.out.println("SLL does not exist.");
		}
		Node temp= head;
		for(int i =0; i< size; i++) {
			System.out.print(temp.value);   // OR    System.out.print(temp.value+" -> ");
			if(i != size-1) {
				System.out.print(" -> ");
			}
			temp=temp.next;
		}
		System.out.println();
	}
	
	// Search in SLL
	boolean search(int nodeValue) {
		if(head == null) {
			System.out.println("SLL does not exist.");
		}
		Node temp = head;
		for(int i=0; i< size; i++) {
			if(temp.value == nodeValue) {
				System.out.println("Found at index  "+i);
				return true;
			}
			temp=temp.next;
		}
		System.out.println("not found");
		return false;
	}
	
	// Deletion in SLL
	void deletefirst() {
		head=head.next;
		size--;
	}
	
	void deleteLast() {
//		tail=null;
		Node temp = head;
		for(int i =0; i< size-1;i++) {
			temp=temp.next;
		}
//		tail=null;
		tail=temp;
		size--;
	}
	
	void deleteMid(int location) {
		Node temp=head;
		for(int i=0;i<location;i++) {
			temp=temp.next;
		}
		temp=temp.next;
		size--;
	}
	
	// Deletion of Entire SLL
	void terminate() {
		head=null;
		tail=null;
		size=0;
	}
}
