package stack.interviewQuestion;

class ThreelnOne{
	int []arr;
	int size;
	int pointer1,pointer2,pointer3;
	
	public ThreelnOne(int stackSize) {
		size=stackSize;
		arr=new int [stackSize];
		pointer1=-1;
		pointer2 = (stackSize/3);
		pointer3 = (2*stackSize)/3;
	}
	
	boolean isEmpty(int n) {
		if(n==1) {
			if(pointer1 == -1) {
				return true;
			}
		}else if(n==2) {
			if(pointer2 == (size/3) ) {
				return true;
			}
		}else if(n==3) {
			if(pointer3 == (2*size/3)) {
				return true;
			}
		}else {
			System.out.println("only 3 stack is available");
		}
		return false;
	}
	
	boolean isFull(int n) {
		if(n==1) {
			if(pointer1 == (size/3)-1) {
				return true;
			}
		}else if(n==2) {
			if(pointer2 == (size/3)-1 ) {
				return true;
			}
		}else if(n==3) {
			if(pointer3 ==size) {
				return true;
			}
		}else {
			System.out.println("only 3 stack is available");
		}
		return false;
	}
	
	void push(int stackNo,int value) {
		if(stackNo == 1) {
			if(isFull(1)) {
				System.out.println("This stack is full try anoter");
			}else {
				pointer1++;
				arr[pointer1]=value;
			}
		}else if(stackNo ==2) {
			if(isFull(2)) {
				System.out.println("This stack is full try another");
			}else {
				
				arr[pointer2]=value;
				pointer2++;
			}
		}else if(stackNo ==3) {
			if(isFull(3)) {
				System.out.println("This stack is full try anoter");
			}else {
				
				arr[pointer3]=value;
				pointer3++;
			}
		}
	}
	
	void pop(int n) {
		if(n==1) {
			if(isEmpty(1)){
				System.out.println("Stack is already empty, insert some");
			}else {
				arr[pointer1]=0;
				pointer1--;
			}
		}else if(n==2) {
			if(isEmpty(2)) {
				System.out.println("Stack is already empty, insert some");
			}else {
				pointer2--;
				arr[pointer2]=0;				
			}
		}else if(n==3) {
			if(isEmpty(3)) {
				System.out.println("Stack is already empty, insert some");
			}else {
				pointer3--;
				arr[pointer3]=0;
				
			}
		}else {
			System.out.println("only 3 stacks exists");
		}
	}
	
	void displayAll() {
		for(int i =0; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}