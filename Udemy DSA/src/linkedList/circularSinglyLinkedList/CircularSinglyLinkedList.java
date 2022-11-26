package linkedList.circularSinglyLinkedList;

class CircularSinglyLinkedList {
	Node head;
	Node tail;
	int size;
	
	
	// Creation in CSLL
	Node create(int nodeValue) {
		head=new Node();
		Node node = new Node();
		node.value=nodeValue;
		node.next=node;
		
		head=node;
		tail=node;
		size=1;
		
		return head;
	}
	
	// Insertion in CSLL
	void insertFirst(int nodeValue) {
		Node node = new Node();
		node.value=nodeValue;
		node.next=head;
		head=node;
		tail.next=node;
		size++;
	}
	
	void insertLast(int nodeValue) {
		Node node = new Node();
		node.value=nodeValue;
		node.next=head;
		tail.next=node;
		tail=node;
		size++;
	}
	
	void insertMid(int nodeValue,int position) {
		Node node = new Node();
		node.value=nodeValue;
		if(head == null) {
			create(nodeValue);
		}else if(position == 0) {
			insertFirst(nodeValue);
		}else if (position >= size) {
			insertLast(nodeValue);
		}
		Node temp = head;
		for(int i =0; i< position-1; i++) {
			temp=temp.next;
		}
		Node after = temp.next;
		temp.next=node;
		node.next=after;
		size++;
	}
	
	//traverse
	void displayall() {
		if(head != null) {
			Node temp = head;
//			int s = size+3;
			for(int i =0; i<size; i++) {
				System.out.print(temp.value);
				temp=temp.next;
				if(i != size-1) {
					System.out.print(" -> ");
				}				
			}
		}else {
			System.out.println("CSLL doesn't exists");
		}
		System.out.println();
	}
	
	// Searching 
	boolean search(int element) {
		Node temp=head;
		for(int i =0; i< size; i++) {
			if(temp.value == element) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	// Deletion 
	
	void deleteFirst() {
		head=head.next;
		tail.next=head;
		size--;
	}
	
	void deleteLast() {
		Node temp= head;
		for(int i=0; i< size-2; i++) {
			temp=temp.next;
		}
		
		temp.next=head;
		tail.value=temp.value;
		size--;
	}
	
	void deleteMid(int pos) {
		Node temp = head;
		for(int i =0; i< pos-1;i++) {
			temp=temp.next;
		}
		Node nextNode = temp.next.next;
		temp.next =nextNode;
		size--;
	}
	
	void deleteAll() {
		head=tail=null;
		size=0;
	}
	
}
