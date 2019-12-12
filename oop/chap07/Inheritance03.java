package oop.chap07;
/*
 * <<��Ӱ��迡�� �����ڰ� ���� Ư¡>>
 * 
 *  * ��� ������ �޼ҵ��� ù°�ٿ��� �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� ���ɹ��� �����Ǿ��ִ�. 
 *  �ڵ����� ����Ŭ������ �޸𸮿� �ø� �� �ֵ��� ����.
 * ��, �ڹٿ��� ����� ��� Ŭ������ �ڹٿ��� �����ϴ� ��ü�� ���� Ư¡�� ��� ������ �Ѵ�.
 * 
 * ��� Ŭ������ �ֻ��� Ŭ���� (�ƹ��͵� ������� �ʰ� ������)�ڵ����� object��� Ŭ������ ��ӵǾ� �ִ�.(�Ⱥ�������)
 * ������Ʈ Ŭ������ ��ü�� ���� Ư¡�� �����ϴ� Ŭ�����̴�. 
 * �׷��� ��� Ŭ���������������� object��� Ŭ������ �θ�Ŭ������ ���� �����Ƿ�, ��ü�� Ư¡�� ���� �ִ� ���̴�. 
 *
 * ������ �޼ҵ� = ����Ÿ���� ���� �޼ҵ�
 * 
 * 1. Ŭ������ ��� �����ڸ޼ҵ��� ù ��° ���忡�� �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� ���ɹ��� �����Ǿ� �ִ�.
 * 		=> �θ�Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �� �����Ƿ�
 * 		=> �θ��� �����ڸ� ȣ���ϴ� ����� super
 * 		super()�� �θ��� �Ű����� ���� �⺻������
 * 
 * 		=> �̹� �ٸ� �����ڸ� ȣ���ϴ� ��쿡��, super()�� �� �� ����. 
 * 			this()�� ȣ���ϴ� ��� super()�� ȣ���� �� ����. 
 * 2. ��� Ŭ������ �ֻ���Ŭ������ java.lang.ObjectŬ���� �̴�.
 * 		=> �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������
 * 			��ӹް� �ִ� Ŭ������ ���� ���, �����Ϸ��� �ڵ����� ����ϵ��� �Ѵ�. 
 *
 * 
 * 3. �θ�Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ؾ� �ϴ� ��쿡��
 *		����Ŭ�������� ���޵� �� �ֵ��� �����ϴ�.
 *		super(��1, ��2...)�� ���� �����Ѵ�.
 *------------------------------
 *	�θ��� �Ű������� �ִ� �����ڸ� ȣ���ϴ� 
 *
 * �θ� ���� ������, ���� ���� ������ ��� ���� ���� �� �ְ� ó���ؾ� �Ѵ�. 
 * this.���� ������ �� ���� ��Ȳ�� �ֱ� ������ �θ�Ŭ�������� ȣ���ؼ� ����Ҽ� �ֵ��� �����ؾ� �Ѵ�. 
 * 
 */
class SuperA extends java.lang.Object{ //�ᱹ �ֻ��� Ŭ������ ������Ʈ Ŭ���� �� ���̴�.
	private String name;
	private int age;
	
	SuperA(){ //�⺻������
		super(); // ��� super();�� �����Ǿ� �ִ� ���̴�.
	}
	SuperA(String name, int age) { //�տ� public�����
		super();
		this.name = name;
		this.age = age;
	}
	
}

class SubA extends SuperA{
	String addr; //subA�� ��� superA�� ����ϰ� �־ �ٸ� Ŭ������ ����� �� ����.
	int point;
	SubA(){ // ���꿡���� �⺻������
		super();
		//super()�� �����Ǿ��ִ�. ��� �����ڸ޼ҵ��� ù ��° ���忡�� super()�� �����Ǿ��ִ�.
	}
	SubA(String addr){
		super();
		this.addr = addr;
		
	}
	
	SubA(String addr, int point){
		this(addr);
		this.point = point;
		
	}
	SubA(String name, int age, String addr, int point){
		
		//this(addr); //�ٷ� ���� SubA(String addr)����this.addr = addr; �����Ƿ�
					//���� ��ü�� �̹� ���ǵǾ��ִ� �Ǵٸ� �����ڸ� ȣ���� ���̴�. 
		super(name, age); //�θ��� �Ű����� 2�� �����ڸ� ȣ��.
		//�ڽ��� �θ�Ŭ������ private �����δ�( private String name;private int age;)���� ���Ѵ�.
		//�ٸ� Ŭ�����ϱ�.�׷��� super(String,int)�� ȣ���ϸ� �ذ��� �� �ִ�.
		this.addr = addr;
		this.point = point;
	}


}

public class Inheritance03 {
	public static void main(String[] args) {
		SubA obj = new SubA("�ϻ�", 1000);
		System.out.println(obj.name + "," + obj.addr + ","
				+ obj.age + "," + obj.point); //����Ŭ������ �ִ� ����Ŭ������ �ֵ� 
		//������ ����Ŭ�������� �ѹ��� ó������� �Ѵ�. 

	}

}