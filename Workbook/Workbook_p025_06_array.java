package Workbook;

public class Workbook_p025_06_array {

	public static void main(String[] args) {

		StuAr[] stuarr  = new StuAr[3];
		
		stuarr[0] = new StuAr();
		stuarr[0].setName("Kim");
		stuarr[0].setKorean(100);
		stuarr[0].setEnglish(90);
		stuarr[0].setMath(95);
		stuarr[0].setScience(89);
		
		
		stuarr[1] = new StuAr();
		stuarr[1].setName("Lee");
		stuarr[1].setKorean(60);
		stuarr[1].setEnglish(70);
		stuarr[1].setMath(99);
		stuarr[1].setScience(98);
		
		
		stuarr[2] = new StuAr();
		stuarr[2].setName("Park");
		stuarr[2].setKorean(68);
		stuarr[2].setEnglish(86);
		stuarr[2].setMath(60);
		stuarr[2].setScience(40);
		
				
		for (int i= 0 ;i<stuarr.length ; i++) {
			stuarr[i].print();
		}
	

	}

}
