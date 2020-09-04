package set2;

public class Exercise29 {

	public static void main(String[] args) {
		BankCustomer bcus1 = new BankCustomer(1001, "Kumar", "Rajajinagar, Bangalore-10");
		BankCustomer bcus2 = new BankCustomer(1002, "Raja");
		BankCustomer bcus3 = new BankCustomer(1003, "Shanthi", "Jayanagar, Bangalore-20", "SB", 1500);
		System.out.println(bcus1.toString());
		System.out.println(bcus2.toString());
		System.out.println(bcus3.toString());
	}

}
