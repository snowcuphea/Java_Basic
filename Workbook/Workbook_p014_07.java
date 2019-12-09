package Workbook;


public class Workbook_p014_07 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		
		for(int i=1; i<101; i++) {
			if((i%num == 0)) {
				sum = sum + i;
				System.out.print(i + "+");
			}
		}
		System.out.println("= " + sum);
	
	}
}
