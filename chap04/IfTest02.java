package chap04;

import java.util.Scanner;
//if~else문과 Scanner
public class IfTest02 {

	public static void main(String[] args) {
		// Scaneer로 점수를 입력받아 90점 이상이면 "통과"를 출력하고
		// 90점 미만이면 "재시험"을 출력하세요.
		
		Scanner num = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int numdata = num.nextInt();
		if(numdata >=90) {
			System.out.println("통과");
		}
		else {
			System.out.println("재시험");
		}

	}

}
