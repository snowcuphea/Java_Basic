package oop.chap06;
//메소드 정의하는 연습을 위한 클래스 
public class MyMethod {
	// 4. 매개변수, 리턴값이 모두 있는 메소드
	// => 숫자 2개를 매개변수로 전달받아 더해서 결과를 리턴하는 메소드
	// 메소드 선언부에 리턴타입을 정의하는 경우, 반드시 메소드의 마지막에서 값을 return해야 합니다.
	public int add(int a, int b) { //리턴 타입이 있을경우 같은 타입의 변수를 하나 선언하고,
		//그 변수를 리턴하는 소스를 적는다.
		int result = 0;
		result = a + b;
		return result;
	}
	
	// 3. 리턴값이 없고 매개변수가 두 개인 메소드
	public void display(String mystr, int num) {
		for(int i = 1 ; i <= num ; i++ ) {
			System.out.print(mystr);
		}
		System.out.println();
	}
	
	
	// 2. 리턴값이 없고 매개변수가 한 개인 메소드
	public void display(String str) {
		
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();	
	}
	
	
	// 1. 매개변수가 없고 리턴값이 없는 메소드
	public void display() { //"public void display()" 가 메소드 선언부, '{' 부터 '}' 까지가 메소드 바디
		for(int i = 1;i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void display(int count, String Str) { 
		//매개변수의 타입 순서가 다르기 때문에, 똑같은 이름으로 메소드 생성 가능하다. 
		//동일한 이름의 메소드를 여러 개 정의해서 사용할 수 있다. 단, 매개변수 타입이나 매개변수 개수는 달라야 한다
		// => 메소드 오버로딩
		for(int i = 1;i<10;i++) {
			System.out.print("*");
		}
		
	}

}
