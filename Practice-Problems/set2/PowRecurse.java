package set2;

public class PowRecurse {

	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.print("Enter number : ");
		int num = h.getPosInt();
		System.out.print("Enter exponent : ");
		int e = h.getPosInt();
		System.out.println(num + "^" + e + " is : " + pow(num, e));
	}

	static int pow(int num, int e) {
		if (e == 0)
			return 1;
		else
			return (num * pow(num, e - 1));
	}

}
