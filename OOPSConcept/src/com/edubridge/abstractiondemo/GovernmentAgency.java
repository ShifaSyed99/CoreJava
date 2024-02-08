package com.edubridge.abstractiondemo;

public abstract class GovernmentAgency {
	
	private String agencyn;
	private long budget;
	
	public String getAgencyn() {
		return agencyn;
	}
	
	public void setAgencyn(String agencyn) {
		this.agencyn = agencyn;
	}
	
	public long getBudget() {
		return budget;
	}
	
	public void setBudget(long budget) {
		this.budget = budget;
	}
	
	//abstract method
	abstract void disp();
	abstract void disp(String agencyn,long budget);
	
	//concrete method
	String display()
	{
		return "Concrete Method";
	}
	
	

}
