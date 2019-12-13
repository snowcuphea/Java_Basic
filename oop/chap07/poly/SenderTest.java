package oop.chap07.poly;
import java.util.Scanner;
//����ڿ��� ������ �϶�� �並 �������. 
public class SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender�ý���********");
		System.out.println("1. Email�� ����");
		System.out.println("2. SMS�� ����");
		System.out.println("3. MMS�� ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int work = key.nextInt();
		Sender sender = null; //�̸��ϼ���, ���ڼ��� �� �� �� �ֱ⶧���� SenderŸ������ ������
		switch(work){
			case 1:
				sender = new EmailSender("���Ϸ�����",100);
				break;
			case 2:
				sender = new SMSSender("�ܹ���",80);
				break;
			case 3:
				sender = new MMSSender("��Ƽ����",1200);
				break;
				//���� Ŭ���� ���� ����� �޾Ƽ� �ش��ϴ� ���� Ŭ������ ����� �Ѵ�. 
				
		}
		SenderLogic s = new SenderLogic();
		s.run(sender);

	}

}
//������ Ÿ���� ������ �����ߴ�. ������� ��������� �پ��� ��ü�� ���εǰԲ������ϰ�
//��������ڰ� �� �����ϴ��Ŀ����� �پ��� ��ü Ŭ���� ������� ����.
//�׸��� ���
//