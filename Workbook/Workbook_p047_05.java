package Workbook;

public class Workbook_p047_05 {

	public static void main(String[] args) {
		
		Account act = new Account();
		
		act.setAccount("441-0290-1203");
		act.setBalance(500000);
		act.setInerestRate(0.073);
		
	
	
		System.out.println("계좌정보: "+ act.getAccount() + " 현재잔액: "+ act.getBalance());
		System.out.println("계좌정보: "+ act.getAccount() + " 현재잔액: "+ act.getBalance());
		System.out.println("이자: "+act.calculateInterest());


	}

}
