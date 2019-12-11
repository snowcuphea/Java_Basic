package oop.chap06;

public class ConsStudent {
	
	private String name;
	private int age;
	private int korean;

	private int english;
	private int math;
	private int science;
	
	public ConsStudent() {
		//�⺻������
	}
	
	public ConsStudent(String name, int age, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public double getAvg() {
		double avg = 0.0;
		avg = (double)(this.korean + this.english + this.math + this.science)/4;
		return avg;
		
	}
	
	public String getGrade() {
		String grd= ""; //�������� ���� ������ �� ���ڿ� ���ָ� �ȴ�.
		//string�� ��üó�� �÷���������, ���ܷ� �⺻��ó�� ���ͷ��� ���·� ���� �Ҵ��ϴ� ���� �����ϴ�. 
		double avg = getAvg(); //���������� ���� ���
		if(avg >= 90 && avg < 100) {
			grd = "A";
		}else if(avg >= 70 && avg < 90) {
			grd = "B";
		}else if(avg >= 50 && avg < 70) {
			grd = "C";
		}else if(avg >= 30 && avg < 50) {
			grd = "D";
		}else {
			grd = "F";
		}
		
		return grd;
		
	}
	
	public void print() {
		System.out.println(getName() + " ���: " + getAvg() + " ���� : " + getGrade());
	}
	

}
