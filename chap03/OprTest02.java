package chap03;
//비교연산자
public class OprTest02 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		//num1변수가 앞의 '+연산자' 영향을 받으면 안되므로 괄호를 꼭 넣어준다.
		System.out.println("num1>num2 : "+(num1>num2));
		System.out.println("num1>=num2 : "+(num1>=num2));
		System.out.println("num1<num2 : "+(num1<num2));
		System.out.println("num1<=num2 : "+(num1<=num2));
		
		System.out.println("num1==num3 : "+(num1==num3));
		System.out.println("num2==num3 : "+(num2==num3));
		System.out.println("num1!=num3 : "+(num1!=num3));

	}

}
