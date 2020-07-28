import java.util.Scanner;

public class CompareStr {
	static String value = "";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two strings : ");
		value = scan.nextLine();
		String str = scan.nextLine();
		scan.close();
		System.out.println("Comparing returned : " + compareTo(str));
	}
	
	public static int compareTo(String anotherString) {
		int len1,len2;
		len1 = value.length();
		len2 = anotherString.length();
		
		int lim = Math.min(len1, len2);
		
		char[] v1 = new char[len1];
		char[] v2 = new char[len2];
		
		for(int i = 0;i < len1;i++)
			v1[i] = value.charAt(i);
		
		for(int i = 0;i < len2; i++)
			v2[i] = anotherString.charAt(i);
		
		int k = 0;
		while(k < lim) {
			char c1 = v1[k];
			char c2 = v2[k];
			if(c1 != c2) {
				return c1-c2;
			}
			k++;
		}
		return len1-len2;
	}
}
