package linkedList.interviewLinkedList;

// Question is 
// Print nth from last node


public class NthFromLast {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.createLL(1);
		ll.insertNode(2);
		ll.insertNode(1);
		ll.insertNode(3);
		ll.insertNode(5);
		ll.insertNode(9);
		ll.traversalLL();
		System.out.println(nth(ll,2));	
	}
	static int nth(LinkedList ll, int pos) {
		Node node=ll.head;
		for(int i = 0; i< ll.size-pos; i++) {
			node=node.next;
		}
		return node.value;
	}
}
