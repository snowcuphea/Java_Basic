package oop.chap07;


public class DessertTest {
	public static void main(String[] args){
		Dessert coffee = new Dessert("아메리카노",4500,5);
		Dessert tea = new Dessert("허브티",3800,1);
		IceCream ice = new IceCream("나뚜르", 5000, 2, 310);
		
		System.out.println("*****매 출 전 표 ***** ");
		Dessert.print(); //클래스이름으로 액세스(static) 고유의값이 아니라서 static으로 호출. 매번같은값
		coffee.printProductInfo(); //객체참조변수로 액세스(non-static) 멤버변수 거쳐야해서 객체로액세스. 매번다른값
		System.out.println();
		tea.printProductInfo();
		System.out.println();
		
		IceCream.print();//리턴값 없음
		ice.printProductInfo(); //리턴값 없음
		
		int sum = coffee.getTotalPrice() //리턴값있음. 변수에 저장했으니까
				  + tea.getTotalPrice()//리턴값있음. 변수에 저장했으니까
				  + ice.getTotalPrice();//리턴값있음. 변수에 저장했으니까
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}
