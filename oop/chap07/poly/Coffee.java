package oop.chap07.poly;

public class Coffee extends Beverage {
	static int amount; //커피가 들어올때마다 공유해야하는 공유변수라서 static 
	
	public Coffee() {
		
	}
	public Coffee(String name) {//Coffee가 들어오는 순간 커피의 판매수량이 1 증가한다. 
		super(name);//주문이 들어온다.
		amount++; //수량이 늘어난다.
		calcPrice();//가격을 계산한다.
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
//		//static멤버를 액세스 하기 위해서 static메소드를 정의해서 액세스한다. 
//		public static int getAmount() {
//			return amount;
//		}
//		
		


	}
	

}
