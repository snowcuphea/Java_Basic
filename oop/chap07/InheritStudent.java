package oop.chap07;

public class InheritStudent extends Person {
	

	private int korean;
	private int english;
	private int math;
	private int science;
	
	public InheritStudent() {
		//기본생성자
	}
	
	public InheritStudent(String name, int age, int korean, int english, int math, int science) {
		//super();
		//this.name = name;
		//this.age = age;
		super(name, age);//부모의 private멤버를 직접 액세스 하지 않고,
						// 생성자를 호출하며 전달한다. 
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
		String grd= ""; //지역변수 만들 때에는 빈 문자열 해주면 된다.
		//string도 객체처럼 올려야하지만, 예외로 기본형처럼 리터럴의 형태로 값을 할당하는 것이 가능하다. 
		double avg = getAvg(); //지역변수로 만들어서 사용
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
		//print(); // 부모클래스인 Person클래스에서 print()메소드 호출
		//그냥 print();로 쓰면 : 같은 이름일 경우, 가장 가까운 것이 실행된다. 그래서 나 스스로 나를 호출한 것이 된다.(무한반복)
		//그래서 overflow 메모리부족 에러가 뜬다. 따라서 부모의 print() 라고 말을 해주어야 한다.
		//따라서 super라는 키워드를 쓴다. 
		super.print(); //부모의 print()
		System.out.println(" 평균:" + getAvg() 
							+ " 학점 : " + getGrade());
	}
	

}
