package chap04;

import java.util.Scanner;

//������ ���̸� �Է¹޾Ƽ� ������ ���� ����ϱ�.
// 1,3�� ����    2,4�� ����    ���� : 1~19�� û�ҳ�, 20�̻��� ����
// ctrl+shift + F : �ڵ� ����(�鿩����)
public class IfExam02 {

	public static void main(String[] args) {
		System.out.println("������ ���� �Է� : ");
		Scanner key = new Scanner(System.in);
		int gender = key.nextInt();
		int age = key.nextInt();

		if (gender == 1 || gender == 3) {
			if (age > 19) {
				System.out.println("���γ���");
			} else {
				System.out.println("û�ҳⳲ��");
			}
		} else {
			if (age > 19) {
				System.out.println("���ο���");
			} else {
				System.out.println("û�ҳ⿩��");
			}
		}
	}
}
