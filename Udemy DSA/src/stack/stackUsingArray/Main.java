package stack.stackUsingArray;

class Main {
	public static void main(String[] args) throws Exception {
		Stack s = new Stack(5);
		try {
		s.push(3);
		s.push(9);
		s.push(10);
		s.push(10);
		s.push(69);
		s.push(11); } catch(Exception e) { System.out.println(e); }
		int a = s.peek();
		System.out.println(a);
		s.delete();
		s.display();
//		s.pop();
//		s.display();
//		System.out.println(s.isEmpty());
//		System.out.println(s.isFull());
	}
}
