package set2;

class SinglyLinkedList {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	void insert(int n) {
		Node node = new Node(n);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("X");
	}

	public static void main(String[] args) {
		Helper h = new Helper();
		SinglyLinkedList ll = new SinglyLinkedList();
		int choice = 0;
		while (choice != 3) {
			System.out.println("Linked List Operations :");
			System.out.println("1.Insert\n2.Show\n3.Exit");
			System.out.print("Enter your choice : ");
			choice = h.getPosInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter number to insert : ");
				ll.insert(h.getInt());
				break;
			}
			case 2: {
				ll.display();
				break;
			}
			case 3: {
				System.out.println("Bye!");
				break;
			}
			default:
				System.out.println("Please enter valid choice.");
			}
		}
	}
}