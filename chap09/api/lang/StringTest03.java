package chap09.api.lang;
//StringŬ������ �⺻ �޼ҵ�� StringŬ������ Ư¡
//=> ���ڿ�ó�� �޼ҵ带 ���� ȣ���ϰų� + �����ڷ� ���ڿ��� �����ϴ� �۾��� ���� ���
// String�� ������� �ʰ� StringBuffer or StringBuilder �� �̿��Ѵ�. 
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		//������ȯ
		System.out.println("str1.toUpperCase()=> "+str1.toUpperCase());
		System.out.println("����������: "+str1);
		System.out.println("str1.toLowerCase()=> "+str1.toLowerCase());
		System.out.println("str1.substring(2)=> "+str1.substring(2));//2���ε������� ���
		System.out.println("str1.substring(2,8)=> "+str1.substring(2,8));//2~7�ε������
		System.out.println("str1.replace('a','A')=> "+str1.replace('a','A'));//a��ã��A�ιٲ�
		System.out.println("����������: "+str1);
		
		//� �Լ��� ����Ѵٰ� �ص� ���������ʹ� ������ �ʾҴ�.
		//String���� �޼ҵ���� ������ �ٲٴ°� �ƴ϶� ������ �о �Ǵٸ� ��Ʈ�� ��ü�� ����� ���̴�.
		//���ڿ������� ����ϰ� �Ͼ�� �������� string�� ���� �ʴ´�. �ʹ� ��ü�� ���� ������� 
		//=> ���:String buffer�� String builder ���
		//���ڿ� ���ο��� ������ ó����(�������ӿ� ���� ������) �Ǿ������� String buffer
		//�������� �������ӿ� ���� ������ �Ǹ� String builder
		
		
		
	}

}