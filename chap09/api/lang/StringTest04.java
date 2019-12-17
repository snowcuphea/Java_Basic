package chap09.api.lang;
//String객체를 다른 타입의 데이터로 변환
public class StringTest04 {
	public static void main(String[] args) {
		
		String str1 = new String("java programming");
		String str2 = new String("java oracle servlet jsp spring");
		
		//1. String -> byte[]
		byte[] data1 = str1.getBytes();
		for(int i=0;i<data1.length;i++) {
			System.out.print(data1[i]+"\t");//배열에 저장된 모든 요소들이 출력됨
		}
		System.out.println();
		
		//2. String -> char[]
		char[] data2 = str1.toCharArray();
		for(int i = 0; i<data2.length ; i++) {
			System.out.print(data2[i]+"\t");
		}
		System.out.println();
		
		//3. String -> String[] 
		String[] data3 = str2.split(" "); //공백을 기준으로 잘라서 배열에 하나씩 넣음
		for(String string : data3) {
			System.out.print(string+"\t");
		}
		System.out.println();
		
		//4. 기본형 -> String
		int i = 1000;
		double d = 10.0;
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		//+연산자 에 하나 문자열있으면 합이 문자열이 된다. 
		test(i+"");
		test(d+"");
	}
	
	public static void test(String data) {
		System.out.println("전달된 데이터=>" + data);
	}

}
