package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time������ ����� ���� �� �������̴�.
		//__�� __�� __��  �� ���·� ����ϱ�
		int time = 8888;
		int hour = time/3600;
		int min = (time-hour*3600)/60;
		int sec = (time-hour*3600)%60;

		System.out.println(hour + "��" + min + "��" + sec+"��");

	}
}
