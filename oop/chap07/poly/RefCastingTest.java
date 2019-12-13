package oop.chap07.poly;
//��ü�� ����ȯ - ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.

class Parent{
	String name = "�嵿��";
	public void display() {
		System.out.println("�θ�Ŭ������ display");
	}
}

class Child extends Parent{
	String name = "�̹�ȣ";
	public void display() {
		System.out.println("�ڽ�Ŭ������ display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ� ");
	}
}

class Child2 extends Parent{
	public void display() {
		System.out.println("�ڽ�Ŭ������ display");
	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("************************************************");
		System.out.println("2. subŸ���� ���������� sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		
		 * 	- ������ ��������Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		 */
		
		System.out.println("************************************************");
		System.out.println("3. superŸ���� ���������� sub��ü�� ����");
		Parent obj3 = new Child();  //������ ��ü�� �ڵ������� �з�Ʈ������ �����ֱ� ������ ����(���ϵ尡 �з�Ʈ����(���)�ϴϱ�)
		//��ġ ū ����Ÿ�Կ� ���� ����Ÿ���� �ִ� ��ó�� ����. //�ڵ�����ȯ �ȴ�. 
		obj3.display(); //�޼ҵ� : �������̵��� �޼ҵ��� �������̵��� �޼ҵ尡 ȣ���
		System.out.println(obj3.name);//����: �������� Ÿ�Կ� �ش��ϴ� 
										//Ŭ������ ��������� ���� 
		//Ÿ���� parentŸ�������� ������ ������ ��ü�� childŸ���̱� ������ 
		//childŸ������ ����ȯ�� �����ϴ�. (�����)
		//obj3.test()// ���� �Ұ�.
		((Child)obj3).test(); //���� obj3�� ����Ÿ���� �з�Ʈ����, ����� ����ȯ�� ���� child�� ���氡��.
		System.out.println("************************************************");
		System.out.println("4. subŸ���� ���������� super��ü�� ����");
		//Child obj4 = new Parent(); // �Ұ���. 
		//Cannot convert from parent to child : �θ� �ڽ����� ����ȯ �� �� ����. 
		
		//Ÿ���� �з�Ʈ�� ������ �з�Ʈ�ۿ� ���� ���Ѵ�.
		//������ ���۷���Ÿ��(������������ ����Ÿ���̳�_ )������ ���ٿ���, ���࿩�� �����ǰ� 
		//�޼Ҵ� �����Ǵ� ��ü�� ���Ŀ� ���� �Ǵܵȴ�.
		//Ÿ���� �з�Ʈ�⶧���� ������ �� �ִ°� �з�Ʈ �޼ҵ�ۿ� ����. ���ϵ� �żҵ�δ� ���� ���Ѵ�.
		//�����ϱ����ؼ��� ���� ��ü�� ��������� ĳ���� �ؾ��Ѵ�. 
		
		System.out.println("************************************************");
		System.out.println("5. subŸ���� �������� = superŸ���� ��������(Super��ü������)");
		//��������� ����ȯ�� �ؼ� ���������� �����Ϸ��� �ӿ�����, ���� ��������� ĳ������ �Ϸ��� �� ��
		//obj1�� Child������ �������� �ʱ� ������ ĳ���� ���ܹ߻� 
		//�����Ϸ� ���̰� ���� �Ϸ��� ��ϱ� Child������ �������� �ʾ�...
		//Child obj5 = (Child)obj1; //obj1�� �з�ƮŸ�� ����
		
		System.out.println("************************************************");
		System.out.println("6. subŸ���� �������� = superŸ���� ��������(Sub��ü������)");
		Child obj6 = (Child)obj3; 
		System.out.println(obj6.name); //������ Ÿ�Կ� ����. obj6�� ���ϵ� Ÿ���̶� �̹�ȣ ����
		obj6.display();
		obj6.test();
		
		//obj1�� obj3�Ѵ� �з�Ʈ ������ ������ obj1�� �з�Ʈ ������ �����ֲ�
		//obj3�� �����ϴ� ��ü�� ���ϵ� ������ ���� �ճ� ������ ĳ������ �����ϴ�.
		
		
		//ĳ������ �Ҷ����� �����ϴ� ��ü�� ����
		
		Parent obj7 = obj2;
		
		Parent obj8 = null;; //������ car����
		Child obj9 = new Child(); //fe
		Child obj10 = null; //fe2
		
		obj8 = obj9; //superŸ�� = subŸ��
		obj10 = (Child)obj8; //�ٷ����ٿ��� obj8���ٰ� obj9�� ����
		//obj9�� ���ϵ�. obj8�� ���ϵ带 ���۷��� �ϴϱ�, ���ϵ忡 ���� ������ �����ִ�.
		//8�� ���ϵ带 �����ϰ�������, ������ 8�� �з�Ʈ Ÿ���̴�. ����Ű�� ���� ���ϵ�� ������.
		//�׷��� ��������� ĳ������ ���ִ� ���̴�. 10�� ���ϵ�ϱ�.
		
		//���������� �ּ������ϰ��־�
		//���� �����ϰ� �ִ� �Ϳ� ���� ĳ���� ���� 
		//������ �� �ִ� ������ ����� Ÿ�Կ� �մ°͸� ����. 
		
		//ĳ������ �� �� �ִٶ�� ����
		
		//�ƹ��͵� �������� ������ ĳ������ �����ϴ�. ������ ����ϸ� �� ���� �����ϱ� ����
		//ex. obj8 = obj9; ���� �����
		//obj10 = (Child)obj8; obj10.test(); �����.
		
		
	}

}
