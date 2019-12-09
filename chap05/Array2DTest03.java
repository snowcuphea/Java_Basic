package chap05;
//2차원 배열의 선언과 생성과 초기화하기
public class Array2DTest03 {
	public static void main(String[] args) {
		int[][] myarr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
						};//int[][] myarr = new int[3][5];와 같다.
		int[][] myarr2 = {
				{1,2,3},
				{6,7,8,9},
				{11,12,13,14,15}
						};//int[][] myarr = new int[3][];와 같다. (각 배열이 가리키는 배열 사이즈 다름)
	
		//myarr와 myarr2의 배열의 배열에 저장된 값을 출력하기
		for (int outer = 0; outer<myarr.length; outer++) {
			for(int i = 0 ; i<myarr[outer].length;i++) {
				System.out.print(myarr[outer][i] + "\t");
			}
			System.out.println();
		}
		System.out.println("====================================");
		for(int k = 0; k<myarr2.length ; k++) {
			for(int j = 0; j<myarr2[k].length ; j++) {
				System.out.print(myarr2[k][j] + "\t");
				
			}
			System.out.println();
		}
		
		
	}

}
