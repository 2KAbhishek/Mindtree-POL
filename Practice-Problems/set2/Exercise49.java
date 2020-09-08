package set2;

public class Exercise49 {

	public static void main(String[] args) {
		Helper h = new Helper();
		int n, d, sum, present = 0;
		int j;

		System.out.print("Enter the number of elements of set: ");
		n = h.getPosInt();
		int a[] = new int[n];
		int x[] = new int[n];

		System.out.println("Enter the elements of set: ");
		for (int i = 0; i < n; i++)
			a[i] = h.getPosInt();

		System.out.print("Enter the positive integer sum: ");
		d = h.getPosInt();

		if (d > 0) {
			for (int i = 0; i < h.pow(2, n) - 1; i++) {
				subset(i, n, x);
				sum = 0;
				for (j = 0; j < n; j++)
					if (x[j] == 1)
						sum = sum + a[j];
				if (d == sum) {
					System.out.print("Subset elements: ");
					present = 1;
					for (j = 0; j < n; j++)
						if (x[j] == 1)
							System.out.print(a[j] + " ");
					System.out.println();
				}
			}
		}

		if (present == 0)
			System.out.println("Solution does not exist!");
	}

	public static void subset(int num, int n, int x[]) {
		int i;
		for (i = 0; i < n; i++)
			x[i] = 0;
		for (i = n - 1; num != 0; i--) {
			x[i] = num % 2;
			num = num / 2;
		}
	}
}
