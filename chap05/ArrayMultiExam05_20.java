package chap05;
//다시풀어보기
public class ArrayMultiExam05_20 {

	public static void main(String[] args) {
		int[][] mat1 = {
				{1,2,3},
				{4,5,6}
		};
		int[][] mat2 = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		int[][] result = new int[mat1.length][mat2[0].length];
		
		for(int i=0; i<mat1.length;i++) {
			for(int j=0; j<mat2[i].length;j++) {
				for(int k = 0; k < mat1.length;k++) {
				result[i][j] = result[i][j] + mat1[i][j]*mat2[i][j];
				
				}
			}
		}
		
		for(int i = 0 ; i < mat1.length;i++) {
			for(int j = 0; j<mat2[i].length;j++) {
				System.out.print(result[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}
