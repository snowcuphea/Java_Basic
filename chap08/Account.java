package chap08;

public class Account extends Exception {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}
	
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance*interestRate/100;
	}
	public void deposit(int money) throws MyException {
		
		if(money<0) {
			throw new MyException("입금액이 0보다 작음 ."); 
			//고의로 예외발생시킴. 문법상으로 마이너스 입금은 되는데, 내가 고의로 예외발생시켜서 에러메세지 출력시킴
			//Try catch는 호출한쪽에서 처리할꺼고
			//그러기 위해서 throw 명령어를 통해서 여기에 조건을 적어준다. 
		}
		
		balance = balance+money;
		
	}
		
	public void withdraw(int money) throws MyException {
	
			if(money<0 || balance<money) {
				throw new MyException("출금액이 0보다 적거나 현재 잔액보다 많음");
			}
			
		balance = balance-money;
		}
	}
















