package edu.mum.cs.cs525.labs.skeleton;

public class SavingAccount extends Account {

	public SavingAccount(String accountNumber) {
		super(accountNumber);
		setInterestService(new SavingInterestService());	
		
		// TODO Auto-generated constructor stub
	}

}
