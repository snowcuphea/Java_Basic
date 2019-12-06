package chap03;
//논리연산자
public class OprTest03 {

	public static void main(String[] args) {
		int num1 = 100, num2 = 200;
		//&연산자(and)
		System.out.println("==========&연산========");
		System.out.println((num1<num2)&(num1>=100));//true&true
		System.out.println((num1<num2)&(num1>100));//true&false
		System.out.println((num1>num2)&(num1>=100));//false&true
		System.out.println((num1>num2)&(num1>100));//false&false
		//|연산자(or)
		System.out.println("==========|연산========");
		System.out.println((num1<num2)|(num1>=100));//true|true
		System.out.println((num1<num2)|(num1>100));//true|false
		System.out.println((num1>num2)|(num1>=100));//false|true
		System.out.println((num1>num2)|(num1>100));//false|false

		System.out.println();//enter키를누른 것과 같은 결과
		System.out.println(!true);
		System.out.println(!false);
	}

}
