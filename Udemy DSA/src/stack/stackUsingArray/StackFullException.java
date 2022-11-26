package stack.stackUsingArray;

@SuppressWarnings("serial")
class StackFullException extends Exception{
	public String toString() {
		return "Stack is Full";
	}
}

@SuppressWarnings("serial")
class StackEmptyException extends Exception{
	public String toString() {
		return "Stack is Empty";
	}
}
