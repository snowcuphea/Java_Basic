package chap03;
//�񱳿����� - ||, &&(���ƿ�����)-��� ���� �˻����� �ʰ� ������ �����ϸ� skip�ϴ� ��� ����
public class OprTest04Short_and_or {

	public static void main(String[] args) {
		int num = 100;
		String str = null;//���� str�� �ƹ��͵� ������� ���� ����
		//str.length();
		// ||�����ڴ�OR�������� Ư���� �ľ��ϰ� ù��° ���� Ʈ��� ���� ���� �˻����� ����
		//&&�����ڴ� and�������� Ư���� �ľ��ϰ� ù��° ���� �޽��� ���� ���� �˻����� ����
		System.out.println(num>=100 || str.length()>10);//�ΰ�¥���� �տ����� Ʈ��� �ڿ����� �˻� ����
		//System.out.println(num>=100 | str.length()>10);//�ϳ�¥���� ������ �� ���� �� �˻�(������ �׿� �����������ִ�.)
	
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
		
	
	
	}

}
