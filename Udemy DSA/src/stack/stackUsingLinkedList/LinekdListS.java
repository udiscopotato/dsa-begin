package stack.stackUsingLinkedList;

class Node{
	Node next;
	int value;
}
class LinekdListS {
	Node head;
	Node tail;
	int size;
	
	void create(int nodeValue) {
		Node node= new Node();
		node.value=nodeValue;
		head=node;
		tail=node;
		size=1;
	}
	
	void insert(int nodeValue) {
		if(head == null) {
			create(nodeValue);
		}
		Node node = new Node();
		node.value=nodeValue;
		node.next=head;
		head=node;
		size++; 
	}
	
	void delete() {
		if(head == null) {
			System.out.println("Empty");
		}
		head=head.next;
		size--;
	}
	
	void deleteAll() {
		head=tail=null;
		size=0;
	}
	
	int show() {
		if(head == null) {
			System.out.println("Empty");
		}
		return head.value;
	}
	
	void display() {
		Node temp = head;
		for(int i =0;i< size; i++) {
			System.out.print(temp.value);
			if(i != size-1) {
				System.out.print(" -> ");
			}
			temp=temp.next;
		}
		System.out.println();
	}
}
