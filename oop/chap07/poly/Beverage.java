package oop.chap07.poly;

public abstract class Beverage {
	private String name;
	int price;
	
	public Beverage() {
		
	}
	public Beverage(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void calcPrice();//징검다리 역할 (다형성의 진정한 의미)
	
	public void print() {
		System.out.println(" 음료는"+getName()+"이며,가격은"+getPrice());
	}
	

	
	

}
