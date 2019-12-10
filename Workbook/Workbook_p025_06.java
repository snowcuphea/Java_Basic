package Workbook;

public class Workbook_p025_06 {

	public static void main(String[] args) {
		
		double avg = 0.0;
		
		
		Student std1 = new Student();
		std1.setName("Kim");
		std1.setKorean(100);
		std1.setEnglish(90);
		std1.setMath(95);
		std1.setScience(89);
		
		
		Student std2 = new Student();
		std2.setName("Lee");
		std2.setKorean(60);
		std2.setEnglish(70);
		std2.setMath(99);
		std2.setScience(98);
		
		
		Student std3 = new Student();
		std3.setName("Park");
		std3.setKorean(68);
		std3.setEnglish(86);
		std3.setMath(60);
		std3.setScience(40);
		
		
		
		std1.print();
		std2.print();
		std3.print();
	

	}

}
