import java.util.Scanner;

public class Hailstone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int steps;
		for (steps = 0; num != 1; steps++) {
			if (num % 2 == 0) {
				int even = num / 2;
				System.out.println(num + " is even, So I take half : " + even);
				num = even;
			} else {
				int odd = num * 3 + 1;
				System.out.println(num + " is odd, So I make 3n+1 : " + odd);
				num = odd;
			}
		}
		System.out.println("There are " + steps + " total steps to reach " + num);
	}

}
