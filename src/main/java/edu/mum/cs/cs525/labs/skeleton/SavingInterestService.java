package edu.mum.cs.cs525.labs.skeleton;

public class SavingInterestService implements InterestService {

	@Override
	public double addInterest(double balance) {
		// TODO Auto-generated method stub
		if(balance <= 1000) return balance * 0.01;
		else if(balance > 1000 && balance <= 5000) return balance * 0.02;
		else return balance * 0.04;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Saving Interest";
	}
	
	
	/*public SavingInterestService() {
		description = "Saving Interest";
	}*/

}
