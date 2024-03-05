package com.edubridge.structural.facade;

public class FranchiseRegistration {

	Franchise KFC;
	Franchise McD;
	Franchise Dominos;
	
	public FranchiseRegistration()
	{
		
	KFC = new KFC();
	McD = new McD();
	Dominos = new Dominos();
	
	}
	
	public void BuyKFC() {
		
		KFC.Option();
		KFC.Cost();
	}
	
	public void BuyMcD() {
		
		McD.Option();
		McD.Cost();
	}

	public void BuyDominos() {
	
		Dominos.Option();
		Dominos.Cost();
	}
}
