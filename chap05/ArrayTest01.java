package chap05;
//�迭�� ���� ���� - ����ϴ� ���
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. �迭�� ����
		int[] myarr;
		int[] myarr2;
		//2. �迭�� ����
		myarr = new int[5]; //heap�� �Ҵ��ؾ� �ϴϱ� new�� ����. ������� 5�� ������ ������ ����
		myarr2 = new int[5];
		System.out.println(myarr); // heap�� ��� ��ġ�� �ִ��� �ּҰ��� ���´�. 
		System.out.println(myarr2);
		System.out.println("myarr�� 2�� ����� ��=> " +myarr[2]);//�ʱⰪ�� 0���� �� �� �ִ�.
		
		//3.�迭�� �ʱ�ȭ - 2�� ��ҿ� 100�� ����
		myarr[2] = 100;
		System.out.println("myarr�� 2�� ����� ��=> " +myarr[2]);
		
		//�迭�� ����� ������ �Ѳ����� ó��
		int[] numarray = new int[3];
		boolean[] boolArray = new boolean[5];
		long[] longArray = new long[100];
		double[] doublearr = new double[100];
		
		
		//�迭�� �⺻ �ʱⰪ
		//�⺻���� ���
		//������ - 0
		//boolean - false
		//�Ǽ��� - 0.0
		System.out.println(numarray[0]); //�ʱⰪ�� 0
		System.out.println(boolArray[0]); //�ʱⰪ�� false�̴�.
		System.out.println(longArray[0]); //�ʱⰪ�� 0
		System.out.println(doublearr[0]); //�ʱⰪ�� 0.0
		
	}

}
