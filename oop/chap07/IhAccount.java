package oop.chap07;

public class IhAccount {
	
	private String account;
	private int balance;
	private double interestRate;
	private String ownerName;
	
	public IhAccount(){
		//기본 생성자
	}
	
	public IhAccount( String account, int balance, double interestRate) {
		
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public IhAccount(String account,String ownerName,int balance) {
		this.account = account;
		this.ownerName = ownerName;
		this.balance = balance;
		
	}
	

	
	

	//set은 수정용
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setInerestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double InterestRate() {
		return interestRate;
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void deposit(int money) {
		this.balance = this.balance + money;	
	}
	
	public void withdraw(int money) {		
		this.balance = this.balance - money;		
	}
	
	public double calculateInterest() {
		double interest = 0.0;
		interest = this.balance* this.interestRate/100;
		return interest;
	}

}

