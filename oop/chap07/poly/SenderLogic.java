package oop.chap07.poly;
public class SenderLogic {
	public void run(Sender obj) { //SenderŬ������ Ŭ��������Ȱ���ϴ� �޼ҵ�
		//EmailSender, SMSSender�� ���� �ʾƵ� �ȴ�. SenderŸ������ �ϸ� �ȴ�.
		System.out.println("����Ϸ�");
		
		//�θ�Ÿ�� ������ �����ϸ�, � ��ü�� ���޵ȴٰ� �ϴ���EmailSender, SMSSender ��� �� ���� �� �մ�.
		
		obj.print();//Ÿ���� ����Ÿ��. �з�ƮŸ���̴�. Ÿ���� �з�Ʈ�� �з�Ʈ�ۿ� ���� ����
		//�ڼ����� ����Ʈ�� ����.. Sender�� ����Ʈ�� ���� ������ ȣ�� �Ұ�
		
		//�ڵ��� SenderŬ������ print�޼ҵ� �������ָ� �ȴ�. 
	}
	

}
