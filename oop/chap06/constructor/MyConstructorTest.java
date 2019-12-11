package oop.chap06.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();//�⺻�����ڰ� ȣ��ƴ�
		//�⺻������ ���� �� ����. �ڵ����� ������� 
		//������ �� �� �����Ϸ��� �ڵ带 Ȯ���ϰ� �⺻�����ڰ� ������ �ڵ����� ������ش�. 
		
		obj.setName("�嵿��");
		obj.setId("jang");
		obj.setPass("1234");
		
		System.out.println(obj.getName() +", " + obj.getId() + ", "+ obj.getPass());

		//�Ű������� �ִ� ������ �޼ҵ带 ȣ���ϸ鼭 �����ʱ�ȭ�ϱ�
		//MyConStructor(String, String, String)
		MyConstructor obj2 = new MyConstructor("�嵿��", "jang", "1234");
		
		System.out.println("=================================================");
		System.out.println(obj2.getName() +", " + obj2.getId() + ", "+ obj2.getPass());
		//���� ����ε�, �ڵ尡 �پ�����. ȿ�����̴�. 
		
		System.out.println("=================================================");
		
		//MyConstructor(String, String, String, String)
		MyConstructor obj3 = new MyConstructor("�嵿��", "jang", "1234","»");
		
		System.out.println(obj3.getName() +", " + obj3.getId() + ", "+ obj3.getPass()
						+obj3.getNickname());
		
		//MyConstructor(String, String, String, String, int)
		MyConstructor obj4 = new MyConstructor("�嵿��", "jang", "1234","»","�ϻ�",1000);
				
		System.out.println(obj4.getName() +", " + obj4.getId() + ", "+ obj4.getPass()
								+obj4.getNickname() + ", " + obj4.getAddr()+","+obj4.getPoint());
		
		
		
	}

}
