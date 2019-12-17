package chap08;

import java.util.Scanner;
//메소드를 호출하는 곳에서 예외를 처리하도록 설정
//



public class ThrowsTest02 {
	//test메소드는ArithmeticException이 발생할 수 있는 메소드다. 
	public int test(int num1, int num2) throws ArithmeticException{ //exception 컴마로 여러개 넣어줄수있다.
	
		int result = 0;
		System.out.println("------test() 메소드 내부------");
		System.out.println("입력값:"+num1);
		System.out.println("입력값:"+num2);
		result = num1/num2;
		System.out.println("결과:"+result);
		System.out.println("------test() 메소드 내부------");
		return result;
	}
	//예외가 발생되는 곳이 아닌, 호출하는 곳에서 직접 처리하기 (예외가 발생할 수 있는 코드에다가는 throws만 )
	public void show() { 
		Scanner key = new Scanner(System.in);
		int result = 0;
		int num1=0, num2=0;
		try {
			System.out.println("숫자입력:");
			num1 = key.nextInt();
			System.out.println("숫자입력:");
			num2 = key.nextInt();
			result = test(num1,num2);
			
		}catch(ArithmeticException e) {
			//num1이 10의배수이면  result에 1000을 할당
			//num2이 7의배수이면 result에 10000을 할당
			//그 외 result 에 100을 할당 
			if(num1 % 10 == 0) {
				result = 1000;
			}else if(num1 % 7 ==0) {
				result = 10000;
			}else {
				result = 100;
			}
		}finally {//무조건 실행되어야 하는 명령문
			System.out.println("test()호출결과:"+ result);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		ThrowsTest02 obj = new ThrowsTest02();//스태틱에서 논스태틱 호출할 때, 
		//자신의 클래스 안의 메소드를 호출한다고 하더라도 객체를 만들어서 호출해야한다.
		obj.show();
		

	}

}
