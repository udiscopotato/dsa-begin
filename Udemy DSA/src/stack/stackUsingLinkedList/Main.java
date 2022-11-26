package stack.stackUsingLinkedList;

class Main {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(3);
		s.push(5);
		s.push(33);
		s.push(62);
		s.push(69);
		s.pop();
		s.showAll();
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}
}
