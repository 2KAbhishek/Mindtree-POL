package set2;

public class Exercise48 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		while (now > 1000) {
			now -= 1000;
		}
		int num = (int) now;
		Helper h = new Helper();
		int tries = 0;
		boolean won = false;
		
		while (!won) {
			System.out.print("Guess a number between 1 and 1000: ");
			int guess = h.getPosInt();
			tries++;
			
			if(guess == num) won = true;
			else if (guess < num) System.out.println("Too low");
			else System.out.println("Too high");
		}
		
		System.out.println("You won in " + tries + " tries");
	}

}
