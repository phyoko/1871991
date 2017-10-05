package edu.mum.cs.cs525.labs.skeleton;

public class CheckingAccount extends Account {

	public CheckingAccount(String accountNumber) {
		super(accountNumber);
		setInterestService(new CheckingInterestService());
		// TODO Auto-generated constructor stub
	}

}
