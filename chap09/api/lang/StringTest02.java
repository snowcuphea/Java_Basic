package chap09.api.lang;
//StringŬ������ �⺻�޼ҵ�
public class StringTest02 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAT(1)=>"+str1.charAt(1));//�ε���1���� ����
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));//�ΰ� ���ڿ� ��ħ
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));//a�� ������ �ε���
		System.out.println("str1.indexOf('��')=>"+str1.indexOf('��'));//�ش繮�ڿ������� -1 ��ȯ
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		//������(�����ʺ���) �ش� ���ڿ��� ã��
		
		System.out.println("str1.length()=>"+str1.length());
		
		//equals�� ��ҹ��ڵ� �����Ѵ�. ���� ��ҹ��� ���о��Ҷ� �����Ѵ�. 
		System.out.println("str1.equals(\"java programming\")=>"
					+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"
					+str1.equals("Java programming"));
		
		//���ڿ���)equalsIgnoreCase�� ��ҹ��ڸ� �����Ѵ�. 
		System.out.println("str1.equals(\"java programming\")=>"
				+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"
				+str1.equalsIgnoreCase("Java programming"));
		
		//���ڿ���)prefix - �ش� ���ڿ��� �����ϴ���(��ҹ��ڵ� ��)
		System.out.println("str1.startsWith(\"java\")=>"
				+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"
				+str1.startsWith("Java"));
		System.out.println("str1.startsWith(\"ming\")=>"
				+str1.startsWith("ming"));
		
		//���ڿ���)prefix - �ش� ���ڿ��� ��������
		System.out.println("str1.endsWith(\"ming\")=>"
				+str1.endsWith("ming"));


		

	}

}
