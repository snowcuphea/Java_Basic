package chap04;

import java.util.Scanner;
//if~else���� Scanner
public class IfTest02 {

	public static void main(String[] args) {
		// Scaneer�� ������ �Է¹޾� 90�� �̻��̸� "���"�� ����ϰ�
		// 90�� �̸��̸� "�����"�� ����ϼ���.
		
		Scanner num = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int numdata = num.nextInt();
		if(numdata >=90) {
			System.out.println("���");
		}
		else {
			System.out.println("�����");
		}

	}

}
