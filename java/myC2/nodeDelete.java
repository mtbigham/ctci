public class nodeDelete{
	public static void main(String[] args){
		Node n3 = new Node(3);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		
		Node temp = n1;
		System.out.println(temp.data);
		while(temp.next != null){
			temp = temp.next;
			System.out.println(temp.data);
		}
		
		System.out.println();
		
		temp = deleteNode(n1, 2);
		
		System.out.println(temp.data);
		while(temp.next != null){
			temp = temp.next;
			System.out.println(temp.data);
		}
	}
	
	private static Node deleteNode(Node head, int d){
		Node n = head;
		
		if(n.data == d){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}