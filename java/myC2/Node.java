/*
Basic Singly-Linked List
*/

class Node{
	Node next = null;
	int data;
	
	public Node(int d){
		data = d;
	}
	
	public Node(int d, Node n){
		data = d;
		next = n;
	}
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
}