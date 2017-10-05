package edu.mum.cs.cs525.labs.skeleton;

public class CheckingInterestService implements InterestService {

	@Override
	public double addInterest(double balance) {
		// TODO Auto-generated method stub
		if (balance <= 1000)
			return balance * 0.015;
		else
			return balance * 0.025;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Checking Interest";
	}
	
/*	public CheckingInterestService() {
		description = "Checking Interest";
	}*/

}
