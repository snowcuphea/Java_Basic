package oop.chap07;

public class InheritStudent_Workbook_p025_06_array {

	public static void main(String[] args) {

		InheritStudent[] stuarr  = new InheritStudent[3];
		
		stuarr[0] = new InheritStudent("Kim",20,  100, 90, 95, 89);
		stuarr[1] = new InheritStudent("Lee",30,  60, 70, 99, 98);	
		stuarr[2] = new InheritStudent("Park",40,  68, 86, 60, 40);
		
		Teacher t1 = new Teacher("Àåµ¿°Ç", 45, "Java");
		Staff s1 = new Staff("±è¾È³ç", 26, "Àü»ê½Ç");
				
		for (int i= 0 ;i<stuarr.length ; i++) {
			stuarr[i].print();
		}		
		t1.print();
		s1.print();

	}

}
