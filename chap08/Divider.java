package chap08;

public class Divider {
	
	public int a;
	public int b;
	
	public Divider() {
		
	}
	public Divider(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double divide(int a, int b) {
		
		double result = 0.0;
		
		try {
			result = a/b;
			
		}catch(ArithmeticException e){
			System.out.println("Exception이 발생했습니다. 다시 입력해 주세요.");
			
		}
		
		return result;
		
		
	}
	
	
	



}
