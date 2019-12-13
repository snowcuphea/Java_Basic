package oop.chap07.poly;

public class Tea extends Beverage {
	static int amount;
	public Tea() {
		
	}
	public Tea(String name) {//Coffee가 들어오는 순간 커피의 판매수량이 1 증가한다. 
		super(name);//주문이 들어온다
		amount++; //수량을 증가시킨다.
		calcPrice(); //가격을 계산한다.
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
