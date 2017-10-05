package edu.mum.cs.cs525.labs.skeleton;

import java.util.Collection;

import edu.mum.cs.cs525.labs.decorate.P1;
import edu.mum.cs.cs525.labs.decorate.P2;
import edu.mum.cs.cs525.labs.decorate.P3;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;

	public AccountServiceImpl() {
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, String customerName, AccountType type) {

		Account account = null;
		if (type == AccountType.Checking)
			account = new CheckingAccount(accountNumber);
		else if (type == AccountType.Saving)
			account = new SavingAccount(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);

		accountDAO.saveAccount(account);

		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);

		accountDAO.updateAccount(account);
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}

	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void addInterest(Account account) {

		InterestService service = account.getInterestService();
		service = new P1(service);
		service = new P2(service);
		service = new P3(service);
		
		account.setInterestService(service);
		
		account.addInterest();
	}
}
