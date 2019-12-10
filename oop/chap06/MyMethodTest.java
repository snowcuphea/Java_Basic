package oop.chap06;
//MyMethod 클래스에서 정의한 메소드를 사용하는 클래스 
public class MyMethodTest {

	public static void main(String[] args) {
		MyMethod m = new MyMethod(); //일단 메모리에 올린다.
		//1. 매개변수가 없고 void인 메소드의 호출 : 매개변수가 아무것도 없으니까 괄호 안에 아무것도 안써준다.
		m.display();
		
		m.display();
		
		m.display();
		
		//메소드를 사용함으로써 코드 중복을 제거하고 재사용을 할 수 있따
		
		
		//2. 매개변수가 한 개, 리턴값이 없는 메소드의 호출
		m.display("★"); //실행하러 갈 때 별이 함께 넘어간다. 
		m.display("♥");
		m.display("♬");
		System.out.println("=======프로그램 종료========");
		
		//3. 매개변수가 2 개, 리턴값이 없는 메소드의 호출
		//m.display(10, "(>_<)"); //오류난다. display(int,String) 유형의 메소드가 없기 때문이다. 
		m.display("(^-^)/ " , 5); //display(String, int) 이런 유형의 display() 메소드를 찾는다.
		
	
		//4.매개변수와 리턴값이 있는 메소드의 호출
		//(1)메소드를 호출하는 경우 리턴값이 존재하는 메소드라면 리턴값과 동일한 타입의 변수를 선언해서 저장해줘야 한다.
		int result = m.add(100, 200);
		System.out.println("(1)메소드호출결과: "+ result);
		//(2)다른 메소드의 매개변수로 전달할 수 있다.
		System.out.println("(2)메소드 호출 결과 : " + m.add(500, 700)); //println도 메소드다.

	}

}
