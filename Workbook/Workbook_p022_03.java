package Workbook;
//2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램
public class Workbook_p022_03 {
	public static void main(String[] args) {
		int[][] arr2 = {
				{5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20},
				{30, 30, 30, 30}		
		};
		int sum = 0;
		double avg;
		int count = 0;
		
		for(int i = 0; i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				sum = sum+ arr2[i][j];
				count++;
			}
		}
		avg = (double)sum/count;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg );
		
	}

}
