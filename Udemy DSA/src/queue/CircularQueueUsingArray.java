package queue;

class CircularQueueUsingArray {
	int [] arr;
	int front;
	int rear;
	int size;
	
	public CircularQueueUsingArray(int size) {
		arr=new int [size];
		this.size = size;
		front =-1;
		rear = -1;
		System.out.println("Circular Queue successfully created of size "+size);
	}
	
	void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else if(isEmpty()) {
			front=0;
			rear++;
			arr[rear]=value;
		}else {
			if(rear+1==size) {
				rear=0;
			}else {
				rear++;
			}
			arr[rear]=value;
		}
	}
	
	boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}
	
	boolean isFull() {
		if(rear+1==front) {
			return true;
		}else if(front ==0 && rear== arr.length-1) {
			return true;
		}
		return false;
	}
	void deQueue() {
		if (isEmpty()) {
			System.out.println("CQ is empty");
		}else {
			arr[front]=0;
			if(front==rear) {
				front=rear=-1;
			}else if(front+1==size) {
				front=0;
			}else {
				front++;
			}
		}
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		return arr[front];
	}
	
	void diplayAll() {
		if(isEmpty()) {
			System.out.println("Array is empty");
		}else if(front > rear) {
			for(int i = front; i <size;i++) {
				System.out.print(arr[i]+" ");
			}
			for(int i = 0; i <= rear;i++) {
			    System.out.println(arr[i]+" ");
			}
		}else {
			for(int i = front; i<=rear; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	int totalElement() {
		if(isEmpty()) {
			return 0;
		}else if(isFull()) {
			return size;
		}else if(front > rear) {
			return (size-front)+rear;
		}else {
			return (rear-front)+1;
		}
	}
	
	@SuppressWarnings("null")
	void deleteQueue() {
		arr=null;
	}
}
