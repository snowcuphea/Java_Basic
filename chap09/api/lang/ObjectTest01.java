package chap09.api.lang;


import java.util.Date;
import java.util.Random;

//Object Ŭ������ �ڹٿ��� �ۼ��ϴ� ��� Ŭ������ �ֻ��� Ŭ����
public class ObjectTest01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); //Ŭ������ ������ �����ϴ� �޼ҵ�
		System.out.println(obj1.hashCode()); //��ü�� ������ ����
		System.out.println(obj1.toString()); //��ü�� �ּҸ� ���� - �⺻�޼ҵ�
		System.out.println(obj1); // obj1.toString()�� ȣ���ϴ� �Ͱ� ���� (�⺻�޼ҵ�ϱ� ���� ����)
		
		Person p1 = new Person("�嵿��", 50, "����");
		System.out.println();
		System.out.println(p1);
		System.out.println();
		//API�� Ŭ������..
		Random rand= new Random();
		System.out.println(rand);
		Date d = new Date();
		System.out.println(d);
		String str = new String("Java");
		System.out.println();

	}

}
