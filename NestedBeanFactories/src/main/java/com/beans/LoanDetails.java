package com.beans;

public class LoanDetails {
	private int loanId;
	private String loanType;
	private String customer;
	public LoanDetails(){
		System.out.println("LoanDetails: 0-param constructor");
	}
	//setters and getters
	public void setLoanId(int loanId){
		this.loanId = loanId;
	}
	public void setLoanType(String loanType){
		this.loanType = loanType;
	}
	public void setCustomer(String customer){
		this.customer = customer;
	}

	public int getLoanId(){
		return loanId;
	}
	public String getLoanType(){
		return loanType;
	}
	public String getCustomer(){
		return customer;
	}
}
