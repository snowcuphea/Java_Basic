package oop.chap07.poly;

public class Tea extends Beverage {
	static int amount;
	public Tea() {
		
	}
	public Tea(String name) {//Coffee�� ������ ���� Ŀ���� �Ǹż����� 1 �����Ѵ�. 
		super(name);//�ֹ��� ���´�
		amount++; //������ ������Ų��.
		calcPrice(); //������ ����Ѵ�.
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = this.amount+amount;
	}
	
	public void calcPrice() {
		if(getName().equals("lemontea")){
			setPrice(1500);
			
		}else if(getName().equals("ginsengTea")) {
			setPrice(2000);
			
		}else if(getName().equals("redginsengTea")) {
			setPrice(2500);
			
		}else {
			setPrice(10);
		
		}
		//setAmount(1);

	}
	

}
