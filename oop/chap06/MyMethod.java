package oop.chap06;
//�޼ҵ� �����ϴ� ������ ���� Ŭ���� 
public class MyMethod {
	// 4. �Ű�����, ���ϰ��� ��� �ִ� �޼ҵ�
	// => ���� 2���� �Ű������� ���޹޾� ���ؼ� ����� �����ϴ� �޼ҵ�
	// �޼ҵ� ����ο� ����Ÿ���� �����ϴ� ���, �ݵ�� �޼ҵ��� ���������� ���� return�ؾ� �մϴ�.
	public int add(int a, int b) { //���� Ÿ���� ������� ���� Ÿ���� ������ �ϳ� �����ϰ�,
		//�� ������ �����ϴ� �ҽ��� ���´�.
		int result = 0;
		result = a + b;
		return result;
	}
	
	// 3. ���ϰ��� ���� �Ű������� �� ���� �޼ҵ�
	public void display(String mystr, int num) {
		for(int i = 1 ; i <= num ; i++ ) {
			System.out.print(mystr);
		}
		System.out.println();
	}
	
	
	// 2. ���ϰ��� ���� �Ű������� �� ���� �޼ҵ�
	public void display(String str) {
		
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();	
	}
	
	
	// 1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public void display() { //"public void display()" �� �޼ҵ� �����, '{' ���� '}' ������ �޼ҵ� �ٵ�
		for(int i = 1;i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void display(int count, String Str) { 
		//�Ű������� Ÿ�� ������ �ٸ��� ������, �Ȱ��� �̸����� �޼ҵ� ���� �����ϴ�. 
		//������ �̸��� �޼ҵ带 ���� �� �����ؼ� ����� �� �ִ�. ��, �Ű����� Ÿ���̳� �Ű����� ������ �޶�� �Ѵ�
		// => �޼ҵ� �����ε�
		for(int i = 1;i<10;i++) {
			System.out.print("*");
		}
		
	}

}
