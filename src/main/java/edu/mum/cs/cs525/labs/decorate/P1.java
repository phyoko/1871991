package edu.mum.cs.cs525.labs.decorate;

import edu.mum.cs.cs525.labs.skeleton.InterestService;

public class P1 extends PromotionDecorator {

	public P1(InterestService interestService) {
		super(interestService);
	}

	/*@Override
	public String getDescription() {
		return interestService.getDescription() + ", P1";
	}*/

	@Override
	public double addInterest(double balance) {
		
		return (balance * 0.03) + interestService.addInterest(balance);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return interestService.getDescription() + ", P1";
	}

}
