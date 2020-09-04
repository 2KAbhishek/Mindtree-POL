package set2;

public class Exercise37 {
	public static void main(String[] args) {
		// Initialize table with row size 5 and col size 10
		int[][] table = new int[5][10];

		// Inserts the values from 0 to 49
		for (int row = 0; row < table.length; row++)
			for (int col = 0; col < table[row].length; col++)
				table[row][col] = row * 10 + col;

		// Prints out col values tab seperated and row values line seperated
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++)
				System.out.print(table[row][col] + "\t");
			System.out.println();
		}
	}
}

// Output

//0		1	2 ... 	9
//...
//40	41	42	...	49