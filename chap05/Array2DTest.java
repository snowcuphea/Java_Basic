package chap05;

import javax.swing.plaf.synth.SynthSplitPaneUI;

//2차원배열 작성 연습
public class Array2DTest {
	public static void main(String[] args) {
		//2차원배열의 선언과 생성
		int[][] myarr = new int[2][3];
		//2차원 배열의 초기화
		myarr[0][0] = 100;
		myarr[1][1] = 200;
		//myarr[2][2] = 300; Exception 발생
		
		System.out.println("myarr의 2번째 요소가 참조하는 배열의 0번 요소의 값: " + myarr[1][0]);
		System.out.println("myarr의 1번째 요소가 참조하는 배열의 0번 요소의 값: " + myarr[0][0]);
		
		
		//다차원 배열의 요소의 갯수
		System.out.println("배열의 요소의 갯수=>"+ myarr.length);
		System.out.println("myarr의 0번요소가 참조하는 배열의 요소의 개수:" + myarr[0].length);
		
		System.out.println("=============================================");
		
		//전체 배열의 요소를 액세스하기
		for(int j=0;j<myarr.length;j++) {
			for(int i=0;i<myarr[j].length;i++) {
				System.out.print(myarr[j][i]+ "\t");
			}
			System.out.println();
		}

	}

}
