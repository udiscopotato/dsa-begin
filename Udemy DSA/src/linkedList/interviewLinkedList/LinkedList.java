package linkedList.interviewLinkedList;

public class LinkedList {
	public Node head;
	public Node tail;
	int size;
	
	void createLL(int nodeValue) {
		Node node = new Node();
		node.value=nodeValue;
		node.next=null;
		head=node;
		tail=node;
		size=1;
	}
	
	void insertNode(int nodeValue) {
		Node node = new Node();
		node.value=nodeValue;
		node.next=null;
		tail.next=node;
		tail=node;
		size++;
	}
	
	void insertFirst(int nodeValue) {
		if(head==null) {
			createLL(nodeValue);
		}else {
			Node node = new Node();
			node.value=nodeValue;
			node.next=head;
			head=node;
			size++;
		}
	}
	void insertLast(int nodeValue) {
		if(head == null) {
			createLL(nodeValue);
		}else {
			Node node = new Node();
			node.value=nodeValue;
			node.next=null;
			tail.next=node;
			tail=node;
			size++;
		}
	}
	
	void traversalLL() {
		Node temp = head;
		for(int i=0; i< size; i++) {
			System.out.print(temp.value);
			if( i != size-1) {
				System.out.print(" -> ");
			}
			temp=temp.next;
		}
		System.out.println();
	}
}
