package Workbook;

public class Workbook_p027_07 {

	public static void main(String[] args) {
		Book[] bk = new Book[3];
		
		int sum = 0;
		double dissum = 0.0;
		
		bk[0] = new Book();
		bk[0].setBookname("SQL Plus");
		bk[0].setBookprice(50000);
		bk[0].setDiscountrate(0.05);
		
		bk[1] = new Book();
		bk[1].setBookname("Java 2.0");
		bk[1].setBookprice(40000);
		bk[1].setDiscountrate(0.03);
		
		bk[2] = new Book();
		bk[2].setBookname("JSP servlet");
		bk[2].setBookprice(60000);
		bk[2].setDiscountrate(0.06);
		
		for(int i=0; i<bk.length;i++) {
			
			System.out.println(bk[i].getBookname() + " "+ bk[i].getBookpirce() +"원 "
					 + bk[i].getDiscountrate()*100 + "% " + bk[i].getDiscountBookPrice() + "원");
			sum += bk[i].getBookpirce();
			dissum += bk[i].getDiscountBookPrice();
		}
		System.out.println("책 가격의 합 : " + sum + "원");
		System.out.println("할인 된 책 가격의 합 : " + dissum + "원");
	}

}
