package oop.chap07.poly; //Sender상속하는 클래스만 만들면 된다. 
public class MMSSender extends Sender {
	int length;
	public MMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//SMSSender에서만 처리되는 고유의 기능을 실행
		System.out.println(length+"로" + name + "전송완료 ");
	}
	
}
