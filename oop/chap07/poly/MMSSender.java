package oop.chap07.poly; //Sender����ϴ� Ŭ������ ����� �ȴ�. 
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
		//SMSSender������ ó���Ǵ� ������ ����� ����
		System.out.println(length+"��" + name + "���ۿϷ� ");
	}
	
}
