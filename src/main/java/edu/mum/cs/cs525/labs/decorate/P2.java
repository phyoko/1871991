package edu.mum.cs.cs525.labs.decorate;

import edu.mum.cs.cs525.labs.skeleton.InterestService;

public class P2 extends PromotionDecorator {
	
	public P2(InterestService interestService) {
		super(interestService);
	}

	/*@Override
	public String getDescription() {
		return interestService.getDescription() + ", P2";
	}*/
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return interestService.getDescription() + ", P2";
	}

	@Override
	public double addInterest(double balance) {
		
		return (balance * 0.02) + interestService.addInterest(balance);
	}


}
