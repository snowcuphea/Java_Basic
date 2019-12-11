package oop.chap06;

public class ConsStudent_Workbook_p025_06_array {

	public static void main(String[] args) {

		ConsStudent[] stuarr  = new ConsStudent[3];
		
		stuarr[0] = new ConsStudent("Kim",20,  100, 90, 95, 89);
		stuarr[1] = new ConsStudent("Lee",30,  60, 70, 99, 98);	
		stuarr[2] = new ConsStudent("Park",40,  68, 86, 60, 40);
				
		for (int i= 0 ;i<stuarr.length ; i++) {
			stuarr[i].print();
		}
		

	}

}
