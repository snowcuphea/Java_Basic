package oop.chap07;

import java.util.Scanner;

public class IhAccountTest {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//üũ���� �����
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","�嵿��"
					,1000000,"1234-5647-8888");
		
		System.out.println("ī���ȣ�Է�:");
		String cardNo = key.next();

		acc1.pay(500000, "1234-5678-8888"); //�� ī��ѹ��� �� ī��ѹ� �޶� ���� �Ұ�
		System.out.println("�����ܾ�====>"+acc1.getBalance());//���Ҹ��ؼ� 100���� 
		acc1.pay(500000, cardNo); //"1234-5647-8888"
		System.out.println("�����ܾ�====>"+acc1.getBalance());//�����ؼ� 50����
		
	}

}
//��ī��Ʈ�� ����ϴ� üŷ��ī��Ʈ �����
//üŷ��ī��Ʈ�� ������ ī��ѹ����̰�, �������� ��ī��Ʈ���� ����ؿ´�.
