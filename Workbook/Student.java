package Workbook;

public class Student {
	
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public void setName(String name) { 
		this.name = name; 
	}
	
	public String getName() {
		return this.name; //클래스에 선언된 name 변수
	}
	
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public int getKorean() {
		return this.korean;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getEnglish() {
		return this.english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return this.math;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	public int getScience() {
		return this.science;
	}
	
	
	
	
	public double getAvg() {
		double avg = 0.0;
		avg = (double)(this.korean + this.english + this.math + this.science)/4;
		return avg;
		
	}
	
	public String getGrade() {
		String grd;
		
		if(getAvg() >= 90 && getAvg() < 100) {
			grd = "A";
		}else if(getAvg() >= 70 && getAvg() < 90) {
			grd = "B";
		}else if(getAvg() >= 50 && getAvg() < 70) {
			grd = "C";
		}else if(getAvg() >= 30 && getAvg() < 50) {
			grd = "D";
		}else {
			grd = "F";
		}
		
		return grd;
		
	}
	public void print() {
		System.out.println(getName() + " 평균: " + getAvg() + " 학점 : " + getGrade());
	}
	

}
