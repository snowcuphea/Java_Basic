package chap05;

public class ArrayCopyTest02 {

	public static void main(String[] args) {//����� �Ű����� : String[] args
		//String[]
		int [] firstarr = new int[5];
		for (int i = 0; i<firstarr.length;i++) {
			firstarr[i] = 10 + i;
			
		}
		
		//firstarr�� ������ �迭�� ����
		int[] secondarr = new int[firstarr.length*2];
		//firstarr�迭�� 0������ firstarr�� ��� ��Ҹ� secondarr�� 0�� ��ġ���� copy�ؼ� �����ϱ�
		System.arraycopy(firstarr, 1, secondarr, 3, 3);
		for (int i = 0; i<secondarr.length;i++) {
			System.out.print(secondarr[i] + " ");
		}
		

	}

}
