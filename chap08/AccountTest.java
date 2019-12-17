package chap08;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);
		System.out.println("계좌정보:"+account.getAccount()
					+" 현재잔액:"+account.getBalance() + " 이자율: " +account.getInterestRate());
		
		try {
			account.deposit(-10);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			account.withdraw(600000);
		}catch(MyException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println("계좌정보:"+account.getAccount()
		+" 현재잔액:"+account.getBalance());
		System.out.println("이자:"+account.calculateInterest());
	}
}
