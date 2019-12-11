package Workbook;

public class Book {
	private String bookname;
	private int bookprice;
	private double discountrate;
	
	public void setBookname(String bookname){
		this.bookname = bookname;
	}
	public String getBookname() {
		return bookname;
	}
	
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	
	public int getBookpirce() {
		return bookprice;
	}
	
	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}
	
	public double getDiscountrate() {
		return discountrate;
	}
	
	public double getDiscountBookPrice() {
		double DisBookPrice=0.0;
		DisBookPrice= this.bookprice*(1-this.discountrate);
		return DisBookPrice;
	}
	

}
