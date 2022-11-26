package linkedList.doublyLinkedList;

class Main {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.create(20);
		dll.insertFirst(30);
	    dll.insertLast(60);
	    dll.insertLast(90);
	    dll.insertLast(10);
	    dll.insertFirst(70);
	    dll.insertMid(50, 1);
	    dll.showAllForword();
	    dll.showAllBack();
	    dll.deleteFirst();
	    dll.deleteLast();
	    dll.deleteMid(3);
	    dll.showAllForword();
	    dll.showAllBack();
	    dll.deleteAll();
		System.out.println(dll.search(25));
		System.out.println(dll.size);
		System.out.println(dll.head.next.value);
	}
}
