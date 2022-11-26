package linkedList.circularSinglyLinkedList;

class Main {
	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.create(21);
		csll.insertFirst(31);
		csll.insertLast(41);
		csll.insertMid(51, 1);
		csll.insertLast(81);
		System.out.println(csll.size);
//		csll.deleteFirst();
//		csll.deleteLast();
//		csll.deleteMid(2);
		csll.deleteAll();
		System.out.println(csll.size);
		System.out.println(csll.tail.value);
		csll.displayall();
		
		System.out.println(csll.search(92));
	}
}
