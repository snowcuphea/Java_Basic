package oop.chap07;
/*
 * 
 * <<상속관계에서 메소드가 갖는 특징 >>
 * 1. 상속관계에서는 상위클래스에 정의된 메소드를 하위클래스에서 사용할 수 있다.
 * 		(하위클래스 참조 변수를 통해서 접근할 수 있다.)
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하고 사용할 수 있다.
 * 		이런 경우 하위클래스의 메소드가 호출된다.
 * 		=> 상위클래스에 선언된 메소드와 동일한 메소드를 하위클래스에 정의하는 것: 메소드 재정의(메소드 오버라이딩)
 * 		메소드 오버라이딩은 : 메소드 선언부가 부모클래스의 메소드 선언부와 반드시 일치해야 한다.
 * 					[메소드명, 매개변수 개수, 매개변수 타입, 리턴타입] 모두 반드시 동일해야 한다.
 * 3. 동일한 이름의 부모클래스의 메소드를 사용하고 싶은 경우, super로 호출한다.
 * 

 * 
 * 보통 클래스를
 * Student obj = new Student(); 만 하면, Stduent만 메모리에 올라가면 stduent가 상속한 부모클래스도 써야하니까
 * 부모클래스도 자동으로 메모리에 올라가게끔.
 * 
 */
class Parent{
	public void display() {
		System.out.println("부모의 display..");
	}
}

class Child extends Parent{
	public void display() {//오버라이딩:메소드 선언부가 부모클래스 메소드 선언부와 일치해야함
		System.out.println("자식 클래스의 display!");
		System.out.println("==============");
		super.display();//3번 문장 예제. 
	}
	public void test() {
		System.out.println("자식클래스의 test");
		display(); //참조변수 없이 부모클래스에 있는 메소드를 불러서 쓸 수 있다.
	}
}

public class InheritanceTest02 {

	public static void main(String[] args) {
	
		Child obj = new Child();
		obj.test();
		obj.display();//1번 설명 예제
		//여기서는 super클래스 못쓴다. 메인이고, 부모자식 클래스 관계가아니다. 

	}

}
