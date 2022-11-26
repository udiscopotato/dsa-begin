package queue;

class Main_CQueue {
	public static void main(String[] args) {
		CircularQueueUsingArray cq = new CircularQueueUsingArray(4);
		cq.enQueue(10);
		cq.enQueue(20);
		cq.enQueue(30);
		cq.enQueue(40);
		cq.deQueue();
		cq.deQueue();
		cq.enQueue(50);
		cq.deQueue();
		cq.deQueue();
		cq.enQueue(60);
		cq.enQueue(70);
		System.out.println(cq.peek());
		System.out.println(cq.totalElement());
		cq.diplayAll();
		cq.deleteQueue();
		System.out.println(cq.size);
	}
}
