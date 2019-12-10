package oop.chap06;

public class PersonTestMJ {

	public static void main(String[] args) {
		Person ps1 = new Person();
		ps1.setName("민정");
		ps1.setAddr("일산");
		ps1.setAge(26);
		
		System.out.println("성명: "+ ps1.getName());
		System.out.println("주소: " + ps1.getAddr());
		System.out.println("나이: "+ ps1.getAge());
		
		Person ps2 = new Person();
		ps2.setName("장동건");
		ps2.setAddr("서울시");
		ps2.setAge(45);
		
		System.out.println("성명: "+ ps2.getName());
		System.out.println("주소: " + ps2.getAddr());
		System.out.println("나이: "+ ps2.getAge());

	}

}
