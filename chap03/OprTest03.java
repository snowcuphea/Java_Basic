package chap03;
//��������
public class OprTest03 {

	public static void main(String[] args) {
		int num1 = 100, num2 = 200;
		//&������(and)
		System.out.println("==========&����========");
		System.out.println((num1<num2)&(num1>=100));//true&true
		System.out.println((num1<num2)&(num1>100));//true&false
		System.out.println((num1>num2)&(num1>=100));//false&true
		System.out.println((num1>num2)&(num1>100));//false&false
		//|������(or)
		System.out.println("==========|����========");
		System.out.println((num1<num2)|(num1>=100));//true|true
		System.out.println((num1<num2)|(num1>100));//true|false
		System.out.println((num1>num2)|(num1>=100));//false|true
		System.out.println((num1>num2)|(num1>100));//false|false

		System.out.println();//enterŰ������ �Ͱ� ���� ���
		System.out.println(!true);
		System.out.println(!false);
	}

}
