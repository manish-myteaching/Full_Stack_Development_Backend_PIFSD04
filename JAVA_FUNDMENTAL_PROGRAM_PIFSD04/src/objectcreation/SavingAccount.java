package objectcreation;

public class SavingAccount {
	long accountNumber; // Instance variable //Heap Area
	String accountHolderName;
	String accountType;
	double balance;
	static String bankName; // class variable //Method Area

	SavingAccount(long accountNumber, String accountHolderName, String accountType, double balance) {
		System.out.println(accountNumber + " " + accountHolderName + " " + accountType + " " + balance);
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
	}

}
