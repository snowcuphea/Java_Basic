package chap08;

import java.util.Scanner;
//�޼ҵ带 ȣ���ϴ� ������ ���ܸ� ó���ϵ��� ����
//



public class ThrowsTest02 {
	//test�޼ҵ��ArithmeticException�� �߻��� �� �ִ� �޼ҵ��. 
	public int test(int num1, int num2) throws ArithmeticException{ //exception �ĸ��� ������ �־��ټ��ִ�.
	
		int result = 0;
		System.out.println("------test() �޼ҵ� ����------");
		System.out.println("�Է°�:"+num1);
		System.out.println("�Է°�:"+num2);
		result = num1/num2;
		System.out.println("���:"+result);
		System.out.println("------test() �޼ҵ� ����------");
		return result;
	}
	//���ܰ� �߻��Ǵ� ���� �ƴ�, ȣ���ϴ� ������ ���� ó���ϱ� (���ܰ� �߻��� �� �ִ� �ڵ忡�ٰ��� throws�� )
	public void show() { 
		Scanner key = new Scanner(System.in);
		int result = 0;
		int num1=0, num2=0;
		try {
			System.out.println("�����Է�:");
			num1 = key.nextInt();
			System.out.println("�����Է�:");
			num2 = key.nextInt();
			result = test(num1,num2);
			
		}catch(ArithmeticException e) {
			//num1�� 10�ǹ���̸�  result�� 1000�� �Ҵ�
			//num2�� 7�ǹ���̸� result�� 10000�� �Ҵ�
			//�� �� result �� 100�� �Ҵ� 
			if(num1 % 10 == 0) {
				result = 1000;
			}else if(num1 % 7 ==0) {
				result = 10000;
			}else {
				result = 100;
			}
		}finally {//������ ����Ǿ�� �ϴ� ��ɹ�
			System.out.println("test()ȣ����:"+ result);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		ThrowsTest02 obj = new ThrowsTest02();//����ƽ���� ����ƽ ȣ���� ��, 
		//�ڽ��� Ŭ���� ���� �޼ҵ带 ȣ���Ѵٰ� �ϴ��� ��ü�� ���� ȣ���ؾ��Ѵ�.
		obj.show();
		

	}

}
