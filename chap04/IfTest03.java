package chap04;

import java.util.Scanner;
//��ø if�� - if�� �ȿ� if�� �����ϰ� ����ϱ� (��� ����� ��ø�� �� �ִ�.)
public class IfTest03 {

	public static void main(String[] args) {
		// Scaneer�� ������ �Է¹޾� 90�� �̻��̸� "���"�� ����ϰ�
		// 90�� �̸��̸� "�����"�� ����ϼ���.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");//println�� �����ٿ� �Է�, print�� �ٷ��Է�
		int numdata = scan.nextInt();
		
		System.out.print("���� Ƚ��: ");
		int count = scan.nextInt();
		if(numdata >=90) {
			System.out.println("���");
		}
		else {
			if(count>=3) {
				System.out.println("ó������ �ٽ� ����");
			}
			else {
				
				System.out.println("�� ���� �����");
			}
			
		}

	}

}
