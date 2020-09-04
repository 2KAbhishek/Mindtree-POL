package set2;

public class SavingsAccount {

	double balance = 0.0;
	int interestRate = 0;
	int accountNo = 0;

	public SavingsAccount(double balance, int interestRate, int accountNo) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}

	public SavingsAccount() {
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	void withDraw(double amount) {
		if (amount > this.balance) {
			System.out.println("ERROR! Withdrawal amount is more than balance.");
		} else {
			this.balance -= amount;
			System.out.println("Succesfully withdrawn : " + amount);
		}
	}

	void calculateInterest() {
		double interest = 0;
		System.out.println("Simple interest per year is : " + (this.balance / 100) * this.interestRate);
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", accountNo=" + accountNo
				+ "]";
	}

}
