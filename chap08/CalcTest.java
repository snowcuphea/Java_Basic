package chap08;

public class CalcTest {

	public static void main(String[] args) {
		
		System.out.println("���� ������ ���� �Է�");
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		
		System.out.println(num1);
		System.out.println(num2);
		
		Divider dv = new Divider();
		
		System.out.println("���: " + dv.divide(num1, num2));
		
		
	}

}
