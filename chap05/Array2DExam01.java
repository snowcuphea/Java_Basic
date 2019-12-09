package chap05;
/*
 * 2차원 배열 연습
 * [출력형태]
 * 1 2 3 4 5
 * 6 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 
 * * 2 3 4 5
 * 6 * 8 9 10
 * 11 12 * 14 15
 * 16 17 18 * 20
 * 21 22 23 24 *

 */

public class Array2DExam01 {
	public static void main(String[] args) {
		//1. 2차원 배열을 생성
		//2. 2차원 배열에 값을 저장하기
		//3. 2차원 배열에 저장된 데이터를 출력형태와 같이 출력하기
		
		int[][] myarr = new int[5][5];

		
		for(int i = 0; i<myarr.length; i++) {
			for (int j = 0 ; j < myarr[i].length ; j++) {
				myarr[i][j] = (j+1)+(i*5); // 또는 int num = 1; 하고 for문 끝날때 num++ 해도 된다.
				
			}
		}
		
		//1~25 5*5배열 출력
		for(int i = 0; i<myarr.length; i++) {
			for (int j = 0 ; j < myarr[i].length ; j++) {
				System.out.print(myarr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		
		
		for(int i = 0; i<myarr.length; i++) {
			for (int j = 0 ; j < myarr[i].length ; j++) {
				if(i==j) {
					System.out.print("*" + "\t");
				}else {
					System.out.print(myarr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		

		
		
		
	}

}
