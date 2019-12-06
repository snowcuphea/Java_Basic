package chap04;

import java.util.Scanner;

//숫자를 입력받아 음수인지 양수인지 출력.
//양수인경우에는 짝수인지 홀수인지 출력하기.
public class IfExam01 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		if (num<0) {
			System.out.println(num+"는 음수입니다.");
		}else {
			if((num%2)==0){
				System.out.println(num+"는 짝수입니다.");
			}else {
				System.out.println(num+"는 홀수입니다.");
			}
			
		}
		
		
		
		

	}

}
