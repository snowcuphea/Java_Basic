package api.util;

import java.util.Scanner;


//ScannerŬ����(API)�� �����
//=> ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� �����ϴ� Ŭ����

//ǥ�� �Է� : System.in
public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���: ");
		String data = key.next();
		// next �޼ҵ�� �����̽��ٳ� ����Ű�� ������ ���������� ������ �����Ѵ�.
		System.out.println("Ű����� �Է¹��� ���ڿ� : " + data);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int numdata = key.nextInt();
		System.out.println("Ű����� �Է¹��� ���� : "+ numdata);

	}

}
