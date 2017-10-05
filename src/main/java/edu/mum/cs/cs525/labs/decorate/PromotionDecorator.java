package edu.mum.cs.cs525.labs.decorate;

import edu.mum.cs.cs525.labs.skeleton.InterestService;

public abstract class PromotionDecorator implements InterestService {

	InterestService interestService;

	public PromotionDecorator(InterestService interestService) {
		this.interestService = interestService;
	}
	
	/*public abstract String getDescription();*/
		
}
