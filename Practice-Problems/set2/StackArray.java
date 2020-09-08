package set2;

class StackArray {
	private int top, maxsize;
	private int[] arr;

	StackArray(int maxsize) {
		this.maxsize = maxsize;
		this.arr = new int[maxsize];
		this.top = -1;
	}

	boolean isEmpty() {
		return (this.top < 0);
	}

	boolean push(int n) {
		if (this.top == this.maxsize - 1) {
			System.out.println("Overflow!");
			return false;
		} else {
			this.top++;
			this.arr[this.top] = n;
			System.out.println("Item pushed : " + n);
			return true;
		}
	}

	boolean pop() {
		if (this.top == -1) {
			System.out.println("Underflow!");
			return false;
		} else {
			System.out.println("Item popped : " + this.arr[this.top]);
			this.top--;
			return true;
		}
	}

	void display() {
		if (!isEmpty()) {
			System.out.println("Printing stack : ");
			for (int i = this.top; i >= 0; i--)
				System.out.print(this.arr[i] + ",");
			System.out.println();
		} else
			System.out.println("Empty stack.");
	}

	public static void main(String[] args) {
		Helper h = new Helper();

		System.out.print("Enter max size of stack : ");
		StackArray s = new StackArray(h.getPosInt());

		int choice = 0;
		while (choice != 4) {
			System.out.println("Stack Operations :");
			System.out.println("1.Push\n2.Pop\n3.Show\n4.Exit");
			System.out.print("Enter your choice : ");
			choice = h.getPosInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter number to push : ");
				s.push(h.getInt());
				break;
			}
			case 2: {
				s.pop();
				break;
			}
			case 3: {
				s.display();
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