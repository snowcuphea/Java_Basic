package Workbook;

import javax.swing.plaf.synth.SynthSeparatorUI;

import oop.chap06.ConsPerson;

public class Workbook_p058_04 {
	public static void main(String[] args) {
		
		double agesum = 0.0;
		double heightsum = 0.0;
		double weightsum = 0.0;
		
		StudentInfo[] std = new StudentInfo[3];
		std[0] = new StudentInfo("홍길동", 15, 171, 81);
		std[1] = new StudentInfo("한사람", 13, 183, 72);
		std[2] = new StudentInfo("임걱정", 16, 175, 65);
		
		System.out.print("이름\t나이\t신장\t몸무게");
		System.out.println();
		for (int i=0;i<3;i++) {
			System.out.println(std[i].getName() + "\t" + std[i].getAge() + "\t"+
					std[i].getHeight() + "\t"+ std[i].getWeight());
			agesum = agesum + std[i].getAge();
			heightsum = heightsum + std[i].getHeight();
			weightsum = weightsum + std[i].getWeight();
			
		}
		System.out.println("신장의 평균: "+ Math.round(agesum/std.length*100)/100.0);

		System.out.println("신장의 평균: " + Math.round(heightsum/std.length*100)/100.0);
		System.out.println("몸무게의 평균: "+Math.round(weightsum/std.length*100)/100.0);
	}
	

}
