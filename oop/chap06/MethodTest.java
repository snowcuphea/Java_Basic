package oop.chap06;
//�޼ҵ��� �Ű������� ����Ÿ������ ������, �迭, �⺻�� ��� ����� �� �ִ�.
public class MethodTest {
	public static void main(String[] args) {
		ConsPerson p = new ConsPerson("����", "�ϻ�", 26);
		
		display(p.getName(),p.getAddr(), p.getAge());
		display(p); //ConsPerson��ü�� �Ű������� ������ �� �ִ�.
		//��ü�� ��°�� �ѱ� �� �ִ�.

	}
	public static void display(String name, String addr, int age) {
		System.out.println(name+","+addr+","+age);
	}
	public static void display(ConsPerson p) {
		System.out.println(p.toString()); //p��ü�� �����ִ� ������ ����Ѵ�. (�ּҷ� ����)
		
	}
	
	//�޼ҵ带 �����Ҷ� �� ���� ���� ������ �� �ִµ�
	//������ Ÿ���� �����͸� ���� �� �����ؾ� �Ѵٸ�, �迭�� ����Ÿ������ �����ϰ�
	//����� �� �ִ�.
	public static int[] addNumber() {//����Ÿ����(��ȯ����) int[]
		int[] myarr = new int[3];
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		
		return myarr;
		
	}
	//Ÿ���� �ٸ� ���� ���� �����͸� �����ϰ� �������
	//�迭�� ������ �� �����Ƿ� �����ϰ� ���� ���� ���� �ִ� ��ü�� �����ؼ� 
	//������ �� �ִ�.
//	public static Stustu getInfo() {
//		//Student�� ��� ������ ����
//		
//		return new Stustu("�嵿��", 90, 100, 50, 78);
//		
//	}
//	

}
