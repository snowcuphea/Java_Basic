package chap05;

public class ArrayCopyTest01 {

	public static void main(String[] args) {
		int[] firstarr = new int[5];
		
		//배열에 값을 할당하기 위한 for문
		for (int i = 0 ; i<firstarr.length;i++) {
			firstarr[i] = 10+i;
		}
		
		//배열에 저장된 값을 출력하기 위한 for문
		for (int i = 0 ; i<firstarr.length;i++) {
			System.out.print(firstarr[i]+"\t");
		}
		System.out.println();
		
		//배열의 사이즈를 변경
		// 1. 새로운 배열을 생성
		int[] secondarr = new int[firstarr.length*3];
		for (int i = 0 ; i<secondarr.length;i++) {
			System.out.print(secondarr[i]+"\t");
			
		}
		System.out.println();
		//2. 기존배열을 새로운 배열에 copy
		for(int i= 0; i<firstarr.length;i++) {
			secondarr[i] = firstarr[i];
		}
		
		for (int i = 0 ; i<secondarr.length;i++) {
			System.out.print(secondarr[i]+"\t");
		}
		
		
		
		

	}

}
