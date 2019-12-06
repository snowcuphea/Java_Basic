package chap04;

import java.util.Scanner;

//성별과 나이를 입력받아서 다음과 같이 출력하기.
// 1,3은 남자    2,4는 여자    나이 : 1~19는 청소년, 20이상은 성인
// ctrl+shift + F : 코드 정리(들여쓰기)
public class IfExam02 {

	public static void main(String[] args) {
		System.out.println("성별과 나이 입력 : ");
		Scanner key = new Scanner(System.in);
		int gender = key.nextInt();
		int age = key.nextInt();

		if (gender == 1 || gender == 3) {
			if (age > 19) {
				System.out.println("성인남자");
			} else {
				System.out.println("청소년남자");
			}
		} else {
			if (age > 19) {
				System.out.println("성인여자");
			} else {
				System.out.println("청소년여자");
			}
		}
	}
}
