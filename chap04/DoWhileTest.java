package chap04;

import java.util.Scanner;
//while���� ������ ������ �Ǵ��ϱ� ������ ������ �������� ������ ������� �� �� ����
//do while�� ������ �ѹ� ���� �� ���� �Ǵ�.
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		while(num>10) {
			//while���� ������ �������� ������ ������ �ڵ尡 ������� �ʴ´�. 
			
			System.out.println("while�� - �����ɹ�:"+num);
			// ���ó���� �õ��� ���Ѵ�. �ƿ� ���ǿ� ���� �ʾƼ� while�� ���� �Ұ�
		}
		
		do {
			System.out.print("�����Է� : ");
			num = key.nextInt();
			System.out.println("do_while�� - �����ɹ�:" +num);
			
		}while(num>10);

	}

}
