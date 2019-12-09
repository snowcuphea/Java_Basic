package Workbook;

public class Exam03_ForToWhile {

	public static void main(String[] args) {
		
		int i = 0;
		while(i<=10) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			
			i++;
		}

	}

}
