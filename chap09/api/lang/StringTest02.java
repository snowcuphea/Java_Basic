package chap09.api.lang;
//String클래스의 기본메소드
public class StringTest02 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAT(1)=>"+str1.charAt(1));//인덱스1번의 문자
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));//두개 문자열 합침
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));//a를 만나는 인덱스
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합'));//해당문자열없으면 -1 반환
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		//마지막(오른쪽부터) 해당 문자열을 찾음
		
		System.out.println("str1.length()=>"+str1.length());
		
		//equals는 대소문자도 구분한다. 따라서 대소문자 구분안할땐 사용안한다. 
		System.out.println("str1.equals(\"java programming\")=>"
					+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"
					+str1.equals("Java programming"));
		
		//문자열비교)equalsIgnoreCase는 대소문자를 무시한다. 
		System.out.println("str1.equals(\"java programming\")=>"
				+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"
				+str1.equalsIgnoreCase("Java programming"));
		
		//문자열비교)prefix - 해당 문자열로 시작하는지(대소문자도 비교)
		System.out.println("str1.startsWith(\"java\")=>"
				+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"
				+str1.startsWith("Java"));
		System.out.println("str1.startsWith(\"ming\")=>"
				+str1.startsWith("ming"));
		
		//문자열비교)prefix - 해당 문자열로 끝나는지
		System.out.println("str1.endsWith(\"ming\")=>"
				+str1.endsWith("ming"));


		

	}

}
