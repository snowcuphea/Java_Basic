package Workbook;
//모바일 배터리 예제
public class Workbook_p60_05 {
	public static void main(String[] args) {
		MobileLtab lt = new MobileLtab("Ltab", 500, "AP-01");
		MobileOtab ot = new MobileOtab("Otab", 1000, "AND-20");
		
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("--------------------------------");
		lt.print();
		ot.print();
		System.out.println();
		
		System.out.println("10분 충전");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("--------------------------------");
		lt.charge(10);
		ot.charge(10);
		lt.print();
		ot.print();
		System.out.println();
		
		
		System.out.println("5분 통화");
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("--------------------------------");
		lt.operate(5);
		ot.operate(5);
		lt.print();
		ot.print();
		System.out.println();
		
	}

}
