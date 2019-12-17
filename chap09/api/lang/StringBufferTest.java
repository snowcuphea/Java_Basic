package chap09.api.lang;
//StringBuffer테스트 : 또다른 객체를 생성하는게 아니라 원본이 바뀐다!!!!!
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("원본=> " + sb);
		
		sb.append("재밌다"); //맨 끝에 추가
		System.out.println("원본=> " + sb);
		
		sb.insert(2, "자바"); //index위치에 문자열을 추가
		System.out.println("원본=> " +sb);
		
		sb.delete(2, 6);//2~5 삭제
		System.out.println("원본=> " +sb);
		
		sb.reverse(); //문자열 순서를 거꾸로
		System.out.println("원본=> " +sb);

	}

}
