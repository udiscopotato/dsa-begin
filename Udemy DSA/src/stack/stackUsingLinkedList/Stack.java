package stack.stackUsingLinkedList;

class Stack {
	LinekdListS ll = new LinekdListS();
	
	void push(int sValue) {
		ll.insert(sValue);
	}
	
	void pop() {
		ll.delete();
	}
	
	boolean isEmpty() {
		if(ll.size == 0) {
			return true;
		}
		return false;
	}
	
	int peek() {
		return ll.show();
	}
	
	int total() {
		return ll.size;
	}
	
	void delete() {
		ll.deleteAll();
	}
	
	void showAll() {
		ll.display();
	}
}
