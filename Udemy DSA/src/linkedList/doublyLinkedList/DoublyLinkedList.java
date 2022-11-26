package linkedList.doublyLinkedList;

class DoublyLinkedList {
	Node head;
	Node tail;
	int size;
	
	// Creation
	Node create(int value) {
		head=new Node();
		Node node = new Node();
		node.value=value;
		node.prev=null;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	// Insertion
	void insertFirst(int value) {
		Node node = new Node();
		node.value=value;
		
		node.next=head;
		node.prev=null;
		head.prev=node;
		head=node;
		tail.next=null;
		size++;
	}
	
	void insertLast(int value) {
		Node node = new Node();
		node.value=value;
		node.next=null;
		node.prev=tail;
		tail.next=node;
		tail=node;
		size++;
	}
	
	void insertMid(int value, int pos) {
		Node node = new Node();
		node.value=value;
		Node temp = head;
		for(int i =0; i< pos-1; i++) {
			temp=temp.next;
		}
		node.prev=temp;
		node.next=temp.next;
		temp.next=node;
		node.next.prev=node;
		size++;
	}
	
	// traverse
	void showAllForword() {
		Node temp= head;
		for(int i =0; i< size; i++) {
			System.out.print(temp.value);
			if(i != size-1) {
				System.out.print(" -> ");
			}
			temp=temp.next;
		}
		System.out.println();
	}
	
	void showAllBack() {
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
	
	// Searching
	boolean search(int value) {
		Node temp = head;
		for(int i =0; i< size ;i++) {
			if(temp.value == value) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	// Deletion
	void deleteFirst() {
		head=head.next;
		head.prev=null;
		size--;
	}
	void deleteLast() {
		tail=tail.prev;
		tail.next=null;
		size--;
	}
	void deleteMid(int pos) {
		Node temp = head;
		for(int i =0; i< pos-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
		size--;
	}
	
	void deleteAll() {
		head=tail=null;
		size=0;
	}
	
}
