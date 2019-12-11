package oop.chap06;

public class NewStudentTest {

	public static void main(String[] args) {
		NewStudent[] stu = new NewStudent[3];
		
		stu[0] = new NewStudent("민정", "일산", 26);
		stu[1] = new NewStudent("gg","서울", 20);
		stu[2] = new NewStudent("agag","ggg", 2);
		
		for (int i=0;i<3;i++) {
			System.out.println(stu[i].getName() + stu[i].getAddr() + stu[i].getAge());
		}
		

	}

}
