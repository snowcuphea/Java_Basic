package chap05;
//배열 액세스하기
public class ArrayTest03 {

	public static void main(String[] args) {
		int[] myarr = new int[50];
		//배열의 요소의 크기를 출력
		System.out.println("배열의 요소의 갯수:" +myarr.length); //string에서의 length()메소드와 다르다
		//여기서 length는 배열의 사이즈를 저장하고 있는 자동으로 제공되는 기본 변수이다.
		//내가 만들지 않아도, 배열을 만들면 자동으로 제공되는 기본 변수이다. 
		for(int i = 0; i<myarr.length ;i++) { //배열의 요소 개수만큼 반복하겠다.
			System.out.println(myarr[i]);
		}
		

	}

}
