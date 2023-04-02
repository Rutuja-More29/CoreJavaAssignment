package augusttest;
//reverse linkedList using stack
import java.util.Stack;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Main {
	public static Node reverseList(Node head) {
		Stack<Node> stack = new Stack<>();
		Node current = head;

		while (current != null) {
			stack.push(current);
			current = current.next;
		}

		Node newHead = stack.pop();
		current = newHead;

		while (!stack.isEmpty()) {
			Node nextNode = stack.pop();
			current.next = nextNode;
			current = nextNode;
		}

		current.next = null;

		return newHead;
	}

	public static void printList(Node head) {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		System.out.println("Original List: ");
		printList(head);

		head = reverseList(head);

		System.out.println("Reversed List: ");
		printList(head);
	}

}
