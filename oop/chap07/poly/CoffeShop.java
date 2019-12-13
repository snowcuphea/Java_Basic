package oop.chap07.poly;
public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
		//coffee랑 tea 객체 생성 (new)안하고 바로 멤버변수로 접근해서 static을 써줘야 합니다. 
		
	}
	public static void getSalesInfo(Beverage[] beverage) {
		for(int i = 0 ;i<beverage.length;i++) {
			System.out.print((i+1)+"번째");
			beverage[i].print();
	}
	}
	
	public static int getTotalPrice(Beverage[] beverage) {
		int total = 0;
		for(int i = 0 ;i<beverage.length;i++) {
			total = total + beverage[i].getPrice();
		}
		
		return total;
	}
	
	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요

	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
}
