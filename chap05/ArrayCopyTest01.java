package chap05;

public class ArrayCopyTest01 {

	public static void main(String[] args) {
		int[] firstarr = new int[5];
		
		//�迭�� ���� �Ҵ��ϱ� ���� for��
		for (int i = 0 ; i<firstarr.length;i++) {
			firstarr[i] = 10+i;
		}
		
		//�迭�� ����� ���� ����ϱ� ���� for��
		for (int i = 0 ; i<firstarr.length;i++) {
			System.out.print(firstarr[i]+"\t");
		}
		System.out.println();
		
		//�迭�� ����� ����
		// 1. ���ο� �迭�� ����
		int[] secondarr = new int[firstarr.length*3];
		for (int i = 0 ; i<secondarr.length;i++) {
			System.out.print(secondarr[i]+"\t");
			
		}
		System.out.println();
		//2. �����迭�� ���ο� �迭�� copy
		for(int i= 0; i<firstarr.length;i++) {
			secondarr[i] = firstarr[i];
		}
		
		for (int i = 0 ; i<secondarr.length;i++) {
			System.out.print(secondarr[i]+"\t");
		}
		
		
		
		

	}

}
