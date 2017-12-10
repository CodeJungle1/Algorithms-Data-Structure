package CodeJungle;

public class ReverseLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public Node reverseLikedList(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public void print(Node head) {
		Node temp = head;
		while (temp != null) {
			if (temp != head)
				System.out.print("-->");
			System.out.print(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		//head.next.next.next.next.next = new Node(6);
		head = reverseLinkedList.reverseLikedList(head);
		reverseLinkedList.print(head);

	}

}
