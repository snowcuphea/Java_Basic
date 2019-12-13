package oop.chap07.poly;

public class Coffee extends Beverage {
	static int amount; //Ŀ�ǰ� ���ö����� �����ؾ��ϴ� ���������� static 
	
	public Coffee() {
		
	}
	public Coffee(String name) {//Coffee�� ������ ���� Ŀ���� �Ǹż����� 1 �����Ѵ�. 
		super(name);//�ֹ��� ���´�.
		amount++; //������ �þ��.
		calcPrice();//������ ����Ѵ�.
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = this.amount + amount;
	}
	public void calcPrice() {
		if(getName().equals("Americano")){
			setPrice(1500);
		
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		
		}else if(getName().equals("Cappuccino")) {
			setPrice(3000);
			
		}else {
			setPrice(10);
			
		}
		
		//setAmount(1);
//		//static����� �׼��� �ϱ� ���ؼ� static�޼ҵ带 �����ؼ� �׼����Ѵ�. 
//		public static int getAmount() {
//			return amount;
//		}
//		
		


	}
	

}
