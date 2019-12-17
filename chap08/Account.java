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
			throw new MyException("�Աݾ��� 0���� ���� ."); 
			//���Ƿ� ���ܹ߻���Ŵ. ���������� ���̳ʽ� �Ա��� �Ǵµ�, ���� ���Ƿ� ���ܹ߻����Ѽ� �����޼��� ��½�Ŵ
			//Try catch�� ȣ�����ʿ��� ó���Ҳ���
			//�׷��� ���ؼ� throw ��ɾ ���ؼ� ���⿡ ������ �����ش�. 
		}
		
		balance = balance+money;
		
	}
		
	public void withdraw(int money) throws MyException {
	
			if(money<0 || balance<money) {
				throw new MyException("��ݾ��� 0���� ���ų� ���� �ܾ׺��� ����");
			}
			
		balance = balance-money;
		}
	}
















