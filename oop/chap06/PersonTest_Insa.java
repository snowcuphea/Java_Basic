package oop.chap06;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("**************인사관리 시스템*************");
		System.out.println("1. 인사등록");
		System.out.println("2. 정보수정");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 사원목록조회");
		System.out.println("원하는 직업을 선택하세요: ");
		
		int work = key.nextInt();
		switch(work) {
			case 1:
				System.out.println("==========1. 인사등록==========");
				System.out.print("성명 : ");
				String name = key.next();
				System.out.print("주소 : ");
				String addr = key.next();
				System.out.print("나이 : ");
				int age = key.nextInt();
				Person p = new Person();//p는 person객체를 참조하는 변수
				p.name = name; //name 은 사용자가 입력한 성명을 저장하는 지역변수
				p.addr = addr; //앞의addr는 person객체의 addr변수, 뒤에있는 addr는 사용자가 입력한 name(지역변수)값
				p.age = age;
				
				System.out.println(p.name + "," + p.addr + "," + p.age);
				
				break;
				
			case 2 :
				System.out.println("===========2. 정보 수정하기==========");
	
		}

	}

}
