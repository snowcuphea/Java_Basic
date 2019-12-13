package oop.chap07;

final class FinalSuper{
	public final void display() { //오버라이딩 방지
		System.out.println("super display");
	}
	
}
class Finalsub extends FinalSuper{ //final메소드는 상속이 불가능
	static final int NUM = 100;
	//약속 : 상수는 대문자로 변수이름 정한다.

	@Override //어노테이션(@) : 컴파일러에게 알려주기 위한 기호.
	public void display() { //final메소드는 오버라이딩 할 수 없다. 
		System.out.println("sub display");
	}
	
	
	
	
}

public class FinalClass {
	public static void main(String[] args) {
		Finalsub obj = new Finalsub();
		//obj.NUM = 1000; //상수이므로 값을 수정할 수 없다.
		System.out.println(Finalsub.NUM);
		obj.display();

	}

}
