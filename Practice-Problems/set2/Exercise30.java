package set2;

public class Exercise30 {

	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.println("Enter account balance : ");
		double bal = h.getPosDouble();
		System.out.println("Enter account interest rate : ");
		int rate = h.getPosInt();
		System.out.println("Enter account number : ");
		int acc = h.getPosInt();
		SavingsAccount sa = new SavingsAccount(bal, rate, acc);
		sa.withDraw(100);
		sa.calculateInterest();
	}

}
