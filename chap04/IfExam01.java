package chap04;

import java.util.Scanner;

//���ڸ� �Է¹޾� �������� ������� ���.
//����ΰ�쿡�� ¦������ Ȧ������ ����ϱ�.
public class IfExam01 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ��� : ");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		if (num<0) {
			System.out.println(num+"�� �����Դϴ�.");
		}else {
			if((num%2)==0){
				System.out.println(num+"�� ¦���Դϴ�.");
			}else {
				System.out.println(num+"�� Ȧ���Դϴ�.");
			}
			
		}
		
		
		
		

	}

}
