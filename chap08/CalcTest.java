package chap08;

public class CalcTest {

	public static void main(String[] args) {
		
		System.out.println("숫자 연산자 숫자 입력");
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		
		System.out.println(num1);
		System.out.println(num2);
		
		Divider dv = new Divider();
		
		System.out.println("결과: " + dv.divide(num1, num2));
		
		
	}

}
