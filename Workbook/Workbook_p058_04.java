package Workbook;

import javax.swing.plaf.synth.SynthSeparatorUI;

import oop.chap06.ConsPerson;

public class Workbook_p058_04 {
	public static void main(String[] args) {
		
		double agesum = 0.0;
		double heightsum = 0.0;
		double weightsum = 0.0;
		
		StudentInfo[] std = new StudentInfo[3];
		std[0] = new StudentInfo("ȫ�浿", 15, 171, 81);
		std[1] = new StudentInfo("�ѻ��", 13, 183, 72);
		std[2] = new StudentInfo("�Ӱ���", 16, 175, 65);
		
		System.out.print("�̸�\t����\t����\t������");
		System.out.println();
		for (int i=0;i<3;i++) {
			System.out.println(std[i].getName() + "\t" + std[i].getAge() + "\t"+
					std[i].getHeight() + "\t"+ std[i].getWeight());
			agesum = agesum + std[i].getAge();
			heightsum = heightsum + std[i].getHeight();
			weightsum = weightsum + std[i].getWeight();
			
		}
		System.out.println("������ ���: "+ Math.round(agesum/std.length*100)/100.0);

		System.out.println("������ ���: " + Math.round(heightsum/std.length*100)/100.0);
		System.out.println("�������� ���: "+Math.round(weightsum/std.length*100)/100.0);
	}
	

}
