package oop.chap07;

public class InheritStudent extends Person {
	

	private int korean;
	private int english;
	private int math;
	private int science;
	
	public InheritStudent() {
		//�⺻������
	}
	
	public InheritStudent(String name, int age, int korean, int english, int math, int science) {
		//super();
		//this.name = name;
		//this.age = age;
		super(name, age);//�θ��� private����� ���� �׼��� ���� �ʰ�,
						// �����ڸ� ȣ���ϸ� �����Ѵ�. 
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
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
		//print(); // �θ�Ŭ������ PersonŬ�������� print()�޼ҵ� ȣ��
		//�׳� print();�� ���� : ���� �̸��� ���, ���� ����� ���� ����ȴ�. �׷��� �� ������ ���� ȣ���� ���� �ȴ�.(���ѹݺ�)
		//�׷��� overflow �޸𸮺��� ������ ���. ���� �θ��� print() ��� ���� ���־�� �Ѵ�.
		//���� super��� Ű���带 ����. 
		super.print(); //�θ��� print()
		System.out.println(" ���:" + getAvg() 
							+ " ���� : " + getGrade());
	}
	

}
