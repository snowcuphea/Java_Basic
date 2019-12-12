package oop.chap07;
//����Ŭ������ ����Ŭ�������� ��ü�������� ���� �ȵ�.
class CheckingAccount extends IhAccount{
	private String cardNo;
	
	public CheckingAccount() {
		
	}
	public CheckingAccount(String account,String ownerName, 
			int balance, String cardNo) {
		super(account, ownerName, balance); //super������ �̰Ŷ� �Ȱ��� ���� 3�� �ִ�
		//�����ڸ� �θ�Ŭ������ �����ߵ�!!!!!!!!!!
		this.cardNo = cardNo;
	}
	
	//���ڿ��� ���� ���Ϸ��� ������!!!!!! equals�� �̿��ؼ� ���Ѵ�. 
	public void pay(int amount, String cardNo ) {
		if(this.cardNo.equals(cardNo)){ 
			//this.cardNo == cardNo �̰Ŵ¾ȵ�. �迭���� ���, �ּҰ��̱� ������
			//�ּҰ� == ���ڿ� �̷����ϸ� Ʋ�� ��Ȳ�� �´�. 
			
	
			if(amount <= getBalance()) {
				
				withdraw(amount);
				
			}else {
				System.out.println("���� �Ұ���, �ܾ� ����");
			}
			
		}else {
			System.out.println("ī���ȣ�� �ٸ��ϴ�.");
		}
	}
}
