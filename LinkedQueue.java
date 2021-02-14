public class LinkedQueue<T> implements QueueInterface<T> {

	private Node fNode = null;
	private Node lNode = null;
	
	public void enqueue(T input) {
		Node newNode = new Node(input);

		if (isEmpty()) {
			fNode = newNode;
		} else {
			lNode.setNextNode(newNode);
		}
		
		lNode = newNode;
	}

	public T dequeue() {
		T front = null;

		try {
			front = this.getFront();
			fNode.setData(front);
			fNode = fNode.getNextNode();
		} catch(Exception e) {}
		
		if (fNode == null) {
			lNode = null;
		}
		return front;
	}

	
	public T getFront() {
		if (this.isEmpty()) {
			return null;
		} else {
			return (T) fNode.getData();
		}
	}


	public boolean isEmpty() {
		return fNode == null && lNode == null;
	}


	public void clear() {
		fNode = null;
		lNode = null;
	}
	

	private class Node {
		private T data = null;
		private Node next = null;
		
		
		public Node(T newNode) {
			data = newNode;
		}
		

		public void setNextNode(Node nextNode) {
			next = nextNode;
		}
		

		public void setData(T newData) {
			data = newData;
		}

		
		public Node getNextNode() {
			return next;
		}
		

		public T getData() {
			return data;
		}		
	}
}