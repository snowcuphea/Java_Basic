package oop.chap07;

public class Dessert {
	
	private String productName;
	private int price;
	private int count;
	
	public Dessert() {
		
	}
	public Dessert(String productName, int price, int count) {
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getTotalPrice() {
		int total = 0;
		total = this.price * this.count;
		return total;
	}
	
	public static void print() {
		System.out.println("===============================");
		System.out.println("주문항목\t가격\t수량\t");
		System.out.println("===============================");
	}
	
	public void printProductInfo() {
		System.out.print(getProductName()+"\t"+getPrice()+"\t"+getCount());
	}
	
	

}
