package chap04;

import java.util.Random;
//if���� randomŬ����
public class IfTest01 {
	public static void main(String[] args) {
		
		Random number = new Random();
		int num = number.nextInt(100)+1;
		if(num>=90) {
			System.out.println("���� : " + num + " => ����");
			System.out.println("�� ��° ����");
		}
		System.out.println("���� : " + num + " => ����");
			

	}

}
