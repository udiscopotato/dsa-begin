package linkedList.circularDoublyLinkedList;

class Main {
	public static void main(String[] args) {
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
		cdll.create(20);
		cdll.insert(30, 5);
		cdll.insert(70, 0);
		cdll.insert(88, 0);
		cdll.insert(69, 0);
		cdll.insert(5, 2);
		cdll.visitForword();
		cdll.visitBack();
		cdll.deletefirst();
		cdll.deleteEnd();
		cdll.deleteMid(1);
		cdll.visitForword();
		System.out.println(cdll.head.value);
		cdll.deleteAll();
		System.out.println(cdll.search(50));
	}
}
