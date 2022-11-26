package queue;


// This is a random Queue class done by me 
// this is not useful
// because deQueue method takes O(1) time complexity in general but here it took O(n) time complexity
// this queue can be treated as circular queue with O(n) time complexity.



class QueueUsingArrayCustom {
	int [] arr;
	int point;
//	int size;
	
	QueueUsingArrayCustom(int value){
		arr= new int [value];
//		size=0;
		point=-1;
	}
	
	void enQueue(int value) {
		if(point >= value-1) {
			System.out.println("Queue is Full");
		}else {
			point++;
			arr[point]=value;
		}
	}
	
	void deQueue() {
		for(int i=0; i< point;i++) {
			arr[i]=arr[i+1];
		}
		arr[point]=0;
		point--;
	}
	
	void display() {
		if(point == -1 ) {
			System.out.println("Queue is empty");
		}
		for(int i =0; i <= point ; i++) {
			System.out.print(arr[i]);
			if(i != point) {
				System.out.print(" <- ");
			}
		}
		System.out.println();
	}
	
	boolean isFull() {
		if(point == arr.length-1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty() {
		if(point == -1 ) {
			return true;
		}
		return false;
	}
	
	int peek() {
		return arr[0];
	}
	
	@SuppressWarnings("null")
	int[] delete() {
		arr=null;
		point=(Integer) null;
		return arr;
	}
}
