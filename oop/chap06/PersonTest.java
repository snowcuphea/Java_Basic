package oop.chap06;
//PersonŬ������ ����ϴ� Ŭ����
public class PersonTest {
//API����ϴ� ����� ����.
	public static void main(String[] args) {
		
		Person p1 = new Person(); //new��¿����ڸ� �̿��ؼ� heap���� �÷����� ���
		p1.setName("�嵿��"); // �� ���� person�� setName(String name)���� ���� this.name�� �嵿������ �ٲ�
		p1.addr = "�����";
		p1.age = 45;//age������ private�� ����Ǿ� �����Ƿ� ������ �� ����.
					//���� ��Ű���� Ŭ���������� ������ �� ����. 
		System.out.println("����:"+p1.getName()); //
		System.out.println("�ּ�:"+p1.addr);//p1�� ���ؼ� name,age,addr ��� ���� ����
		System.out.println("����:"+p1.age);
		
		Person p2 = new Person(); //new��¿����ڸ� �̿��ؼ� heap���� �÷����� ���
		p2.name = "�����";
		p2.addr = "����";
		p2.age = 26;
		//���������� �׼����ؼ� ���� �Ҵ�
		
		
		System.out.println("����:"+p2.name); //p1�� ���ؼ� name,age,addr ��� ���� ����
		System.out.println("�ּ�:"+p2.addr);
		System.out.println("����:"+p2.age);
		
		
	}

}
