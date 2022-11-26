package linkedList.singlyLinkedList;

class Main {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.createSingly(32);
		sll.insertFirst(69);
		sll.insertLast(81);
		sll.insertMiddle(10, 1);
		sll.insertMiddle(20,2);
		System.out.println(sll.size);
//		System.out.println(sll.head.value);		
//		System.out.println(sll.head.next.value);
//		System.out.println(sll.head.next.next.value);
//		System.out.println(sll.head.next.next.next.value);
//		System.out.println(sll.tail.value);
		sll.deletefirst();
		sll.deleteLast();
		sll.deleteMid(2);
		sll.displayall();
		sll.search(20);
		sll.terminate();
		System.out.println(sll.size);
	}
}
