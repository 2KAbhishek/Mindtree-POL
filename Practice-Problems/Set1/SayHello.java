import java.util.Scanner;

public class SayHello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		scan.close();
		greet(name);
	}
	
	public static void greet(String name) {
		System.out.println("Hello, "+name + "!");
	}

}
