package Workbook;

public class WorkbookTest05 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);
		
		
		Calc cal1 = new Calc();
		sum = cal1.calcSum(num1, num2, num3, num4);
		avg = (double)sum/args.length;
		
		System.out.println("Sum:"+ sum);
		System.out.println("Avg:"+avg);
		
		if(avg >= 90 && avg < 100) {
			System.out.println("A����");
		}else if(avg >= 70 && avg < 90) {
			System.out.println("B����");
		}else if(avg >= 50 && avg < 70) {
			System.out.println("C����");
		}else if(avg >= 30 && avg < 50) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		}
		
		
	}

}
