package objectcreation;

public class Account {

	long accountNumber; // Instance variable //Heap Area
	String accountHolderName;
	String accountType;
	double balance;
	static String bankName; // class variable //Method Area

	static {
		Account.bankName = "Axis";
		System.out.println(Account.bankName);		
	}

	public static void main(String... k) {
		System.out.println("main");
		Account account = new Account(); // Initialize + Intstantiation
		account.accountNumber = 10000001;
		account.accountHolderName = "Manish";
		account.accountType = "Saving";
		account.balance = 5000.5254;

		Account account2 = new Account(); // Initialize + Intstantiation
		account2.accountNumber = 10000002;
		account2.accountHolderName = "Sumit";
		account2.accountType = "Saving";
		account2.balance = 7000.5254;

		Account account3 = new Account(); // Initialize + Intstantiation
		account3.accountNumber = 10000002;
		account3.accountHolderName = "Ramesh";
		account3.accountType = "Saving";
		account3.balance = 9000.5254;

		System.out.println("AccountNumber: " + account.accountNumber);
		System.out.println("AccountHolderName: " + account.accountHolderName);
		System.out.println("AccountType: " + account.accountType);
		System.out.println("Balance: " + account.balance);
		System.out.println("BankName: " + Account.bankName);
		System.out.println("\n");

		System.out.println("AccountNumber: " + account2.accountNumber);
		System.out.println("AccountHolderName: " + account2.accountHolderName);
		System.out.println("AccountType: " + account2.accountType);
		System.out.println("Balance: " + account2.balance);
		System.out.println("BankName: " + Account.bankName);
		System.out.println("\n");

		System.out.println("AccountNumber: " + account3.accountNumber);
		System.out.println("AccountHolderName: " + account3.accountHolderName);
		System.out.println("AccountType: " + account3.accountType);
		System.out.println("Balance: " + account3.balance);
		System.out.println("BankName: " + Account.bankName);

	}
}
