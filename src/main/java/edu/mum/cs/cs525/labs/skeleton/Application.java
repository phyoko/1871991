package edu.mum.cs.cs525.labs.skeleton;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// create 2 accounts;
		accountService.createAccount("1111345", "Frank Brown", AccountType.Checking);
		accountService.createAccount("2222456", "Frank Brown", AccountType.Saving);
		
		accountService.createAccount("3333898", "John Doe", AccountType.Checking);
		accountService.createAccount("4444787", "John Doe", AccountType.Saving);
		
		// use Frank Checking Account
		accountService.deposit("1111345", 240);
		accountService.deposit("1111345", 529);
		accountService.withdraw("1111345", 230);
		
		// use Frank Saving Account
		accountService.deposit("2222456", 240);
		accountService.deposit("2222456", 529);
		accountService.withdraw("2222456", 230);
		
		// use John Checking Account
		accountService.deposit("3333898", 12450);
		accountService.transferFunds("3333898", "1111345", 100, "payment of invoice 10232");
		
		// use John Saving Account
		accountService.deposit("4444787", 12450);
		accountService.transferFunds("4444787", "2222456", 100, "payment of invoice 10232");
				
		
		// show balances

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
			
			accountService.addInterest(account);
			
			System.out.println("After Interest Adding");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
			
		}
	}

}
