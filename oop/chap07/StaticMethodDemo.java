package oop.chap07;

import javax.swing.plaf.synth.SynthSplitPaneUI;

//static메소드
// - static멤버를 제어하기 위한 용도
// - 유틸리티처럼 자주 사용하는 메소드 
public class StaticMethodDemo {
	
	public static void staticTest1() {
		//1. static메소드에서 static메소드 접근하기 - 일반적인 방법  가능
		staticTest02();
		System.out.println("staticTest1()");
	}
	public void display() {
		//2. non-static메소드에서 non-static메소드 호출 - 일반적인 방법 가능
		show();
		System.out.println("display()");
	}
	public static void staticTest02(){
		System.out.println("staticTest2");
	}
	public void show() {
		//3. non-static메소드에서 static 메소드 호출
		System.out.println("show()");
	}

	public static void staticTest3(){
		//4. static메소드에서 non-static메소드 호출
		//-> non-static메소드가 메모리에 없기 때문에 같은 클래스에서 정의된 메소드라고 하더라도
		//무조건 객체생성 후 호출해야 한다. 
		StaticMethodDemo obj= new StaticMethodDemo(); 
		obj.show(); 
		System.out.println("staticTest03");
	}
	//static멤버는 무조건 시작할때 메모리에 올라가지만
	//클래스 메소드를 사용하는 시점에 일반메소드는 아직 안올라와있다.(객체만들어서 따로 메모리에 올리는 작업 먼저 해야하기 때문\)
}
