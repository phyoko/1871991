package edu.mum.cs.cs525.labs.skeleton;

public interface InterestService {
	/*
	String description = "Unknown Interest";
	  
	public String getDescription() {
		return description;
	}*/
 
	public abstract double addInterest(double balance);
	
	public String getDescription();

}
