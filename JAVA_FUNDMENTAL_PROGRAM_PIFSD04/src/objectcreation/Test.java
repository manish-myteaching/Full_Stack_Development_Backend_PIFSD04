package objectcreation;

public class Test {

	public static void main(String... k) {
		SavingAccount savingAccount = new SavingAccount(10000001, "Manish", "Saving", 5000.5254);

		System.out.println("AccountNumber: " + savingAccount.accountNumber);
		System.out.println("AccountHolderName: " + savingAccount.accountHolderName);
		System.out.println("AccountType: " + savingAccount.accountType);
		System.out.println("Balance: " + savingAccount.balance);
		System.out.println("BankName: " + Account.bankName);
		System.out.println("\n");
	}
}
