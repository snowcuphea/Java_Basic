package chap09.api.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1을 AVAJ로 출력되도록 구현하세요
		//단, StringBuffer의 reverse사용하지 않기
		//String클래스의 charAt과 toUpperCase() 이용하기

		String str1 = "java";
		String data = str1.toUpperCase();
		
		for(int i = str1.length()-1; i>=0 ; i-- ) {
			System.out.print(data.charAt(i));
		}

		

	}

}
