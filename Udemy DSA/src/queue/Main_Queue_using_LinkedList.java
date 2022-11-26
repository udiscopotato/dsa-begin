package queue;

class Main_Queue_using_LinkedList {
	public static void main(String[] args) {
		QueueLinkedList qll = new QueueLinkedList();
		qll.enqueue(9);
		qll.enqueue(11);
		qll.enqueue(13);
		qll.enqueue(15);
		qll.enqueue(17);
		qll.enqueue(19);
		qll.enqueue(21);
		qll.dequeue();
		qll.dequeue();
		System.out.println(qll.peek());
		System.out.println(qll.isEmpty());
		qll.displayAll();
		
//		Singly_LinkedList sll = new Singly_LinkedList();
//		sll.create(13);
//		sll.add(15);
//		sll.add(19);
//		sll.add(21);
//		sll.display();
//		System.out.println(sll.peek());
	}
}
