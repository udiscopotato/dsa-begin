package queue;


class Singly_LinkedList {
	Node head;
	Node tail;
	int size;
	
	void create(int nodeValue) {
		head=new Node();
		Node node = new Node();
		node.next=null;
		node.value=nodeValue;
		
		head=node;
		tail=node;
		
		size=1;
	}
	
	void add(int nodeValue) {
		Node node = new Node();
		node.value=nodeValue;
		
			tail.next=node;
			node.next=null;
			tail=node;
			size++;
				
	}
	
    void remove() {
    	head=head.next;
    	size--;
    }
    
    int peek() {
    	return head.value;
    }
	
    boolean isEmpty() {
    	if(head==null) {
    		return true;
    	}
    	return false;
    }
    
    void display() {
    	Node temp = head;
    	for(int i = 0; i < size; i++) {
    		System.out.print(temp.value);
    		if(i < size-1) {
    			System.out.print(" -> ");
    		}
    		temp=temp.next;
    	}
    	System.out.println();
    }
    
    void delete() {
    	head=tail=null;
    	size=0;
    }
}
