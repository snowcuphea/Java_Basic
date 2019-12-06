package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time변수에 저장된 값은 초 데이터이다.
		//__시 __분 __초  의 형태로 출력하기
		int time = 8888;
		int hour = time/3600;
		int min = (time-hour*3600)/60;
		int sec = (time-hour*3600)%60;

		System.out.println(hour + "시" + min + "분" + sec+"초");

	}
}
