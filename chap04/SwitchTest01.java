package chap04;

import java.util.Scanner;

//switch 연습 - 기본문법(MultiIfTest클래스의 내용을 switch로 변경)
//switch는 if~else if문을 대신할 수 있는 제어문
public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호 7번째 자리를 입력하세요: ");
		int ssn = key.nextInt();
		
		switch(ssn) { //true|false를 판단할 수 있는 조건이 아니라
		//평가할 값이 저장된 변수 or 연산식 or 메소드호출
			case 1 :
				System.out.println("남자");
				break;
			case 2 :
				System.out.println("여자");
				break;
			case 3 :
				System.out.println("남자");
				break;
			case 4 :
				System.out.println("여자");
				break;
			default : //if 문의 else와 같은 역할
				System.out.println("기타");
				
		
		}
		
	}

}
