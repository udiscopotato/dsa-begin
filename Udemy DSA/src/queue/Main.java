package queue;

class Main {
	public static void main(String[] args) {
//		QueueUsingArrayCustom q = new QueueUsingArrayCustom(4);
//		q.enQueue(8);
//		q.enQueue(3);
//		q.enQueue(13);
//		q.enQueue(44);
//		q.deQueue();
////		q.delete();
//		q.display();
//		System.out.println(q.peek());
		
		
		
		
		// Another 
		
		
		QueueArray qq = new QueueArray(4);
		qq.enQueue(8);
		qq.enQueue(3);
		qq.enQueue(13);
		qq.enQueue(44);
		qq.deQueue();
		qq.peek();
		System.out.println(qq.isFull());
		System.out.println(qq.isEmpty());
		qq.show();
	}
}
