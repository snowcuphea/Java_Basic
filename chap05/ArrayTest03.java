package chap05;
//�迭 �׼����ϱ�
public class ArrayTest03 {

	public static void main(String[] args) {
		int[] myarr = new int[50];
		//�迭�� ����� ũ�⸦ ���
		System.out.println("�迭�� ����� ����:" +myarr.length); //string������ length()�޼ҵ�� �ٸ���
		//���⼭ length�� �迭�� ����� �����ϰ� �ִ� �ڵ����� �����Ǵ� �⺻ �����̴�.
		//���� ������ �ʾƵ�, �迭�� ����� �ڵ����� �����Ǵ� �⺻ �����̴�. 
		for(int i = 0; i<myarr.length ;i++) { //�迭�� ��� ������ŭ �ݺ��ϰڴ�.
			System.out.println(myarr[i]);
		}
		

	}

}
