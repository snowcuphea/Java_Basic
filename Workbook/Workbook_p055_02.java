package Workbook;

public class Workbook_p055_02 {
	public static void main(String[] args) {
		
		double num = Double.parseDouble(args[0]);
		Company cp1 = new Company(num);
		System.out.println("�� �⺻�� ��: "+cp1.getIncome()+" ����: "+ cp1.getAfterTaxIncome());
		System.out.println("�� ���ʽ� ��: "+cp1.getBonuss()+" ����: "+cp1.getAfterTaxBonuss());
		System.out.println("�� ���޾� ��: "+(cp1.getAfterTaxIncome()+cp1.getAfterTaxBonuss()));
		
	}

}
