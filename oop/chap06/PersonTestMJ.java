package oop.chap06;

public class PersonTestMJ {

	public static void main(String[] args) {
		Person ps1 = new Person();
		ps1.setName("����");
		ps1.setAddr("�ϻ�");
		ps1.setAge(26);
		
		System.out.println("����: "+ ps1.getName());
		System.out.println("�ּ�: " + ps1.getAddr());
		System.out.println("����: "+ ps1.getAge());
		
		Person ps2 = new Person();
		ps2.setName("�嵿��");
		ps2.setAddr("�����");
		ps2.setAge(45);
		
		System.out.println("����: "+ ps2.getName());
		System.out.println("�ּ�: " + ps2.getAddr());
		System.out.println("����: "+ ps2.getAge());

	}

}
