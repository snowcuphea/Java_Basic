package chap09.api.lang;
//StringBuffer�׽�Ʈ : �Ǵٸ� ��ü�� �����ϴ°� �ƴ϶� ������ �ٲ��!!!!!
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("����=> " + sb);
		
		sb.append("��մ�"); //�� ���� �߰�
		System.out.println("����=> " + sb);
		
		sb.insert(2, "�ڹ�"); //index��ġ�� ���ڿ��� �߰�
		System.out.println("����=> " +sb);
		
		sb.delete(2, 6);//2~5 ����
		System.out.println("����=> " +sb);
		
		sb.reverse(); //���ڿ� ������ �Ųٷ�
		System.out.println("����=> " +sb);

	}

}
