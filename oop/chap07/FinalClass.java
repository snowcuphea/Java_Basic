package oop.chap07;

final class FinalSuper{
	public final void display() { //�������̵� ����
		System.out.println("super display");
	}
	
}
class Finalsub extends FinalSuper{ //final�޼ҵ�� ����� �Ұ���
	static final int NUM = 100;
	//��� : ����� �빮�ڷ� �����̸� ���Ѵ�.

	@Override //������̼�(@) : �����Ϸ����� �˷��ֱ� ���� ��ȣ.
	public void display() { //final�޼ҵ�� �������̵� �� �� ����. 
		System.out.println("sub display");
	}
	
	
	
	
}

public class FinalClass {
	public static void main(String[] args) {
		Finalsub obj = new Finalsub();
		//obj.NUM = 1000; //����̹Ƿ� ���� ������ �� ����.
		System.out.println(Finalsub.NUM);
		obj.display();

	}

}
