package chap04;

import java.util.Scanner;
//while문은 위에서 조건을 판단하기 때문에 조건을 만족하지 않으면 블록으로 들어갈 수 없다
//do while은 무조건 한번 실행 후 조건 판단.
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		while(num>10) {
			//while문은 조건을 만족하지 않으면 블럭안의 코드가 실행되지 않는다. 
			
			System.out.println("while문 - 실행명령문:"+num);
			// 얘는처음에 시도도 못한다. 아예 조건에 맞지 않아서 while문 진입 불가
		}
		
		do {
			System.out.print("숫자입력 : ");
			num = key.nextInt();
			System.out.println("do_while문 - 실행명령문:" +num);
			
		}while(num>10);

	}

}
