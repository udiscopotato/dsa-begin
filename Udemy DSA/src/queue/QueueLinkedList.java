package queue;

class QueueLinkedList {
	Singly_LinkedList sll;
	
	public QueueLinkedList() {
		sll=new Singly_LinkedList();
	}
	
	boolean isEmpty() {
		return sll.isEmpty();
	}
	
	void enqueue(int Value) {
		if (sll.head==null) {
			sll.create(Value);
		}else {
			sll.add(Value);
		}
		
	}
	
	void dequeue() {
		sll.remove();
	}
	
	int peek() {
		return sll.peek();
	}
	
	void delete() {
		sll.delete();
	}
	
	void displayAll() {
		sll.display();
	}
	
	int size() {
		return sll.size;
	}
}
