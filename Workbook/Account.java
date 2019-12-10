package Workbook;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
		
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
	
	
	public void deposit(int money) {
		this.balance = this.balance + money;	
	}
	
	public void withdraw(int money) {		
		this.balance = this.balance - money;		
	}
	
	public double calculateInterest() {
		double interest = 0.0;
		interest = this.balance* this.interestRate;
		return interest;
	}

}
