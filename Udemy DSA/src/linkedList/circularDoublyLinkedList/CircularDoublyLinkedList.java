package linkedList.circularDoublyLinkedList;

//import linkedList.doublyLinkedList.Node;

class CircularDoublyLinkedList {
	Node head;
	Node tail;
	int size;
	
	// Creation 
	Node create(int nodeValue) {
		head= new Node();
		Node node = new Node();
		node.value= nodeValue;
		head=node;
		tail=node;
		size  =1;
		return head;
	}
	
	// Insert
	void insert(int nodeValue, int pos) {
		if(head==null) {
			create(nodeValue);
		}else if(pos == 0) {
			Node node = new Node();
			node.value=nodeValue;
			node.next=head;
			head.prev=node;
			head=node;
			head.prev=tail;
			tail.next=head;
		}else if(pos >= size) {
			Node node = new Node();
			node.value= nodeValue;
			node.next=head;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}else {
			Node node = new Node();
			node.value= nodeValue;
			Node temp = head;
			for(int i =0 ; i< pos-1; i++) {
				temp= temp.next;
			}
			
			node.next=temp.next;
			temp.next= node;
			node.next.prev=node;
			node.prev=temp;
		}
		size++;
	}
	
	// Traverse
	void visitForword() {
		Node temp =head;
		for(int i =0 ; i< size; i++) {
			System.out.print(temp.value);
			if(i != size-1) {
				System.out.print(" -> ");
			}
			temp=temp.next;
		}
		System.out.println();
	}
	void visitBack() {
		Node temp=tail;
		for(int i = size; i>0; i--) {
			System.out.print(temp.value);
			if(i != 1) {
				System.out.print(" -> ");
			}
			temp=temp.prev;
		}
		System.out.println();
	}
	
	// Search 
	boolean search(int value) {
		Node temp  = head;
		for(int i =0; i < size ;i ++) {
			if(temp.value == value) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	// Deletion
	void deletefirst() {
		head=head.next;
		head.prev=tail;
		size--;
	}
	void deleteEnd() {
		tail=tail.prev;
		tail.next=head;
		size--;
	}
	void deleteMid(int pos) {
		Node temp=head;
		for(int i =0; i<pos-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
		size--;
	}
	void deleteAll() {
		head=tail=null;
		size=0;
		System.out.println("deleted");
	}
}
