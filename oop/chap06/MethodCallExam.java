package oop.chap06;
//메소드의 호출 과정
public class MethodCallExam {
	public void test() {
		first();//같은 클래스에 선언된 메소드 호출 가능
	}
	
	public void first() {
		second();
	}
	
	public void second() {
		System.out.println("second()~~~~");
	}
	
	public static void main(String[] args) {
		MethodCallExam obj = new MethodCallExam();
		obj.test();
	}

}
