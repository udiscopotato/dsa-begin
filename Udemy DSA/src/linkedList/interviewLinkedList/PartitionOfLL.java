package linkedList.interviewLinkedList;

public class PartitionOfLL {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.createLL(1);
		ll.insertNode(2);
		ll.insertNode(1);
		ll.insertNode(3);
		ll.insertNode(5);
		ll.insertNode(9);
		ll.traversalLL();
		LinkedList temp = partition(ll, 2);
		temp.traversalLL();
	}
	
	static LinkedList partition(LinkedList ll, int value) {
		LinkedList t = new LinkedList();
		
		Node temp = ll.head;
		for(int i =0; i < ll.size; i++) {
			if(temp.value < value) {
				t.insertFirst(temp.value);
			}else {
				t.insertLast(temp.value);
			}
			temp=temp.next;
		}
		
		return t;
	}
	
//	static LinkedList part(LinkedList ll, int value) {
//		Node temp = ll.head;
//		while(temp != null) {
//			if(temp.value < value) {
//				
//			}
//		}
//	}
}
