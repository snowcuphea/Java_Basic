package chap08;

import java.util.Scanner;

//예외가 발생된 곳에서 예외를 처리하도록 정의
//예외가 발생된 곳에서 예외를 처리하면 호출하는 곳에서는 어떤 예외가 발생했는지 알수 없고
//예외가 발생할 때 경우에 따라서 다르게 처리하고 싶어도 할 수 없다. 


public class ThrowsTest01 {
	public int test(int num1, int num2) { //계산만 하는 메소드
		int result = 0;
		try { //try 안에 생성하는 변수는 모두 지역변수
		System.out.println("------test() 메소드 내부------");
		System.out.println("입력값:"+num1);
		System.out.println("입력값:"+num2);
		result = num1/num2;
		System.out.println("결과:"+result);
		System.out.println("------test() 메소드 내부------");
		}catch(ArithmeticException e) {
			//예외가 발생되면 result 변수에는 0을 정의한다. 
			result = 0;
		}
		return result;
	}
	public void show() { //숫자를 전달하며 test()를 호출하는 메소드 
		Scanner key = new Scanner(System.in);
		System.out.println("숫자입력:");
		int num1 = key.nextInt();
		System.out.println("숫자입력:");
		int num2 = key.nextInt();
		int result = test(num1,num2);
		
		//무조건 실행되어야 하는 명령문
		System.out.println("test()호출결과:"+ result);
	}
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();//스태틱에서 논스태틱 호출할 때, 
		//자신의 클래스 안의 메소드를 호출한다고 하더라도 객체를 만들어서 호출해야한다.
		obj.show();
		

	}

}
