package Workbook;

public class Workbook_p047_05 {

	public static void main(String[] args) {
		
		Account act = new Account();
		
		act.setAccount("441-0290-1203");
		act.setBalance(500000);
		act.setInerestRate(0.073);
		
	
	
		System.out.println("��������: "+ act.getAccount() + " �����ܾ�: "+ act.getBalance());
		System.out.println("��������: "+ act.getAccount() + " �����ܾ�: "+ act.getBalance());
		System.out.println("����: "+act.calculateInterest());


	}

}
