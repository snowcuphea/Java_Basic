package Workbook;

import java.util.Random;

public class Workbook_p023_04 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		Random key = new Random();
		
		int sum = 0;
		double avg;
		
		for(int i= 0; i<5; i++) {
			arr3[i] = key.nextInt(10)+1;
			System.out.print(arr3[i] + "\t");
			sum = sum + arr3[i];
		}
		System.out.println();
		avg = (double)sum / arr3.length;
		
		System.out.println("sum = "+ sum);
		System.out.println("avg = " + avg);
		

	}

}
