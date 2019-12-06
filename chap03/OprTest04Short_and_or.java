package chap03;
//비교연산자 - ||, &&(숏컷연산자)-모든 항을 검사하지 않고 조건을 만족하면 skip하는 경우 생김
public class OprTest04Short_and_or {

	public static void main(String[] args) {
		int num = 100;
		String str = null;//현재 str은 아무것도 저장되지 않은 변수
		//str.length();
		// ||연산자는OR연산자의 특성을 파악하고 첫번째 항이 트루면 뒤의 항은 검사하지 않음
		//&&연산자는 and연산자의 특성을 파악하고 첫번째 항이 펄스면 뒤의 항은 검사하지 않음
		System.out.println(num>=100 || str.length()>10);//두개짜리는 앞에꺼가 트루면 뒤에꺼는 검사 안함
		//System.out.println(num>=100 | str.length()>10);//하나짜리는 무조건 두 항을 다 검사(오른쪽 항에 문법오류가있다.)
	
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
		
	
	
	}

}
