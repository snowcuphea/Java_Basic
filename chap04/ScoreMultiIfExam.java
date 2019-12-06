package chap04;

import java.util.Scanner;

public class ScoreMultiIfExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = key.nextInt();		
		if (score < 0 | score > 100) {
			System.out.println("잘못 입력");
		} else {
			
			if (score >= 90 & score <= 100) {
				System.out.println("A");
			} else if (score >= 80 & score < 90) {
				System.out.println("B");
			} else if (score >= 70 & score < 80) {
				System.out.println("C");
			} else if (score >= 60 & score < 70) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}

	}
}
