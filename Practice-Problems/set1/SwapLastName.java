import java.util.Scanner;

public class SwapLastName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two names : ");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		scan.close();
		String firstName1 = "", firstName2 = "", lastName1 = "", lastName2 = "";
		
		for (int i = 0; i < name1.length(); i++) {
			char c = name1.charAt(i);
			if (Character.isSpaceChar(c)){
				firstName1 = name1.substring(0, i);
				lastName1 = name1.substring(i);
			}
		}

		for (int i = 0; i < name2.length(); i++) {
			char c = name2.charAt(i);
			if (Character.isSpaceChar(c)){
				firstName2 = name2.substring(0, i);
				lastName2 = name2.substring(i);
			}
		}
		
		String newName1 = firstName1 + lastName2;
		String newName2 = firstName2 + lastName1;
		System.out.println("After swapping : " + newName1 + " " + newName2);
	}

}
