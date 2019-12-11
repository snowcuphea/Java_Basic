package Workbook;

public class Workbook_p055_02 {
	public static void main(String[] args) {
		
		double num = Double.parseDouble(args[0]);
		Company cp1 = new Company(num);
		System.out.println("연 기본급 합: "+cp1.getIncome()+" 세후: "+ cp1.getAfterTaxIncome());
		System.out.println("연 보너스 합: "+cp1.getBonuss()+" 세후: "+cp1.getAfterTaxBonuss());
		System.out.println("연 지급액 합: "+(cp1.getAfterTaxIncome()+cp1.getAfterTaxBonuss()));
		
	}

}
