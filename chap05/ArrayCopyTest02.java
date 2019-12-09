package chap05;

public class ArrayCopyTest02 {

	public static void main(String[] args) {//명령행 매개변수 : String[] args
		//String[]
		int [] firstarr = new int[5];
		for (int i = 0; i<firstarr.length;i++) {
			firstarr[i] = 10 + i;
			
		}
		
		//firstarr를 복사할 배열을 선언
		int[] secondarr = new int[firstarr.length*2];
		//firstarr배열의 0번부터 firstarr의 모든 요소를 secondarr의 0번 위치부터 copy해서 저장하기
		System.arraycopy(firstarr, 1, secondarr, 3, 3);
		for (int i = 0; i<secondarr.length;i++) {
			System.out.print(secondarr[i] + " ");
		}
		

	}

}
