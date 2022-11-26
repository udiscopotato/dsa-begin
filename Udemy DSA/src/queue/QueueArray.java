package queue;

class QueueArray {
	int [] arr;
	int end;
	int start;
	
	QueueArray(int size){
		arr= new int [size];
		start=-1;
		end=-1;
	}
	
	boolean isFull() {
		if(end == arr.length-1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty() {
		if(start == -1 || start == arr.length-1) {
			return true;
		}
		return false;
	}
	void enQueue(int value) {
		if(isEmpty()) {
			start=0;
			end++;
			arr[end]=value;
		}else if(isFull()) {
			System.out.println("oops Queue is full");
		}else {
			end++;
			arr[end]=value;
		}
	}
	
	void deQueue() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
		}else {
			arr[start]=0;
			start++;
		}
	}
	
	void show() {
		for(int i = start; i <= end; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
		}
		return arr[start];
	}
}
