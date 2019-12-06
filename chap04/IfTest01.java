package chap04;

import java.util.Random;
//if문과 random클래스
public class IfTest01 {
	public static void main(String[] args) {
		
		Random number = new Random();
		int num = number.nextInt(100)+1;
		if(num>=90) {
			System.out.println("점수 : " + num + " => 만족");
			System.out.println("두 번째 문장");
		}
		System.out.println("점수 : " + num + " => 종료");
			

	}

}
