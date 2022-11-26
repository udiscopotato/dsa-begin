package stack.stackUsingArray;

class Stack {
	int []arr;
	int pointer;
	
	Stack(int size) {
		arr= new int[size];
		pointer=-1;
		System.out.println("a New empty stack is created of size "+size);
	}
	
	boolean isEmpty() {
		if(pointer == -1) {
			return true;
		}
		return false;
	}
	
	boolean isFull() {
		if(pointer == arr.length-1) {
			return true;
		}
		return false;
	}
	
	void push(int value) throws StackFullException{
		if(pointer == arr.length-1) {
			throw new StackFullException();
		}else {
			pointer++;
			arr[pointer]=value;
		}
	}
	
	void pop() throws StackEmptyException {
		if(pointer == -1) {
			throw new StackEmptyException();
		}else {
			arr[pointer]=0;
			pointer--;
		}
	}
	
	int peek() {
		if(pointer == -1) {
			System.out.println("chal na laude");
			return 0;
		}
		return arr[pointer];
	}
	
	void display() {
		if(pointer == -1) {
			System.out.println("Stack is empty");
		}
		for(int i=0; i< pointer+1; i++) {
			System.out.print(arr[i]);
			if(i != pointer) {
				System.out.print(" -- ");
			}
		}
		System.out.println();
	}
	
	void delete() {
		arr=null;
		pointer=-1;
	}
}
