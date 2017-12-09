package CodeJungle;

public class FindMiddleInLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public Node findMiddleLikedList(Node head) {
		if (head == null)
			return head;
		Node slowPointer = head, fastPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
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
		FindMiddleInLinkedList findMiddle = new FindMiddleInLinkedList();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		System.out.println(findMiddle.findMiddleLikedList(head).data);

	}

}
