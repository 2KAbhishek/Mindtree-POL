package set2;

class QueueArray {
	private int front, rear, maxsize;
	private int[] arr;

	QueueArray(int maxsize) {
		this.maxsize = maxsize;
		this.arr = new int[maxsize];
		this.front = this.rear = 0;
	}

	boolean isEmpty() {
		return (this.front == this.rear);
	}

	boolean enqueue(int n) {
		if (this.rear == this.maxsize) {
			System.out.println("Queue is full!");
			return false;
		} else {
			this.arr[this.rear] = n;
			this.rear++;
			System.out.println("Item enqueed : " + n);
			return true;
		}
	}

	boolean dequeue() {
		if (isEmpty()) {
			System.out.println("Empty Queue!");
			return false;
		} else {
			rear--;
			System.out.println("Dequeued : " + this.arr[this.rear]);
			return true;
		}
	}

	void display() {
		if (!isEmpty()) {
			System.out.println("Printing queue : ");
			for (int i = this.front; i < this.rear; i++)
				System.out.print(this.arr[i] + ",");
			System.out.println();
		} else
			System.out.println("Empty Queue!");
	}

	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.print("Enter max size of queue : ");
		QueueArray q = new QueueArray(h.getPosInt());

		int choice = 0;
		while (choice != 4) {
			System.out.println("Queue Operations :");
			System.out.println("1.Enqueue\n2.Dequeue\n3.Show\n4.Exit");
			System.out.print("Enter your choice : ");
			choice = h.getPosInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter number to enqueue : ");
				q.enqueue(h.getInt());
				break;
			}
			case 2: {
				q.dequeue();
				break;
			}
			case 3: {
				q.display();
				break;
			}
			case 4: {
				System.out.println("Bye!");
				break;
			}
			default:
				System.out.println("Please enter valid choice ");
			}
		}
	}
}