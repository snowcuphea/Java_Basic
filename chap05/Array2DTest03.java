package chap05;
//2���� �迭�� ����� ������ �ʱ�ȭ�ϱ�
public class Array2DTest03 {
	public static void main(String[] args) {
		int[][] myarr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
						};//int[][] myarr = new int[3][5];�� ����.
		int[][] myarr2 = {
				{1,2,3},
				{6,7,8,9},
				{11,12,13,14,15}
						};//int[][] myarr = new int[3][];�� ����. (�� �迭�� ����Ű�� �迭 ������ �ٸ�)
	
		//myarr�� myarr2�� �迭�� �迭�� ����� ���� ����ϱ�
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
