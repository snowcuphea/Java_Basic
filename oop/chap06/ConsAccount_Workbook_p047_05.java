package oop.chap06;

public class ConsAccount_Workbook_p047_05 {

	public static void main(String[] args) {
		
		ConsAccount act = new ConsAccount("441-0290-1203", 500000, 7.3);
		
	
		act.deposit(20000);
	
		System.out.println("��������: "+ act.getAccount() + " �����ܾ�: "+ act.getBalance());
		System.out.println("��������: "+ act.getAccount() + " �����ܾ�: "+ act.getBalance());
		System.out.println("����: "+act.calculateInterest());


	}

}
