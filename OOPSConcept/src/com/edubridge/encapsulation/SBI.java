package com.edubridge.encapsulation;

public class SBI {
	
	private String branch;
	private String IFSC;
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getIFSC() {
		return IFSC;
	}
	
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	@Override
	public String toString() {
		return "SBI [branch=" + branch + ", IFSC=" + IFSC + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
