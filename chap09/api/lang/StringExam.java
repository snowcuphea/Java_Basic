package chap09.api.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1�� AVAJ�� ��µǵ��� �����ϼ���
		//��, StringBuffer�� reverse������� �ʱ�
		//StringŬ������ charAt�� toUpperCase() �̿��ϱ�

		String str1 = "java";
		String data = str1.toUpperCase();
		
		for(int i = str1.length()-1; i>=0 ; i-- ) {
			System.out.print(data.charAt(i));
		}

		

	}

}
