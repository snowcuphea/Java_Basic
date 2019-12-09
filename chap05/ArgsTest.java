package chap05;

public class ArgsTest {
	public static void main(String[] args) {
		/*
		args = new String[2]
						-------
						명령행 매개변수의 갯수만큼 설정
		args[0] = "100"
		args[1] = "200"
		
		//명령행 매개변수 2개를 입력받겠다는 뜻
		*/
		System.out.println("명령행 매개변수->"+args[0]);
		System.out.println("명령행 매개변수->"+args[1]);
		for(int i = 0 ; i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("합->" + args[0] + args[1]);
		//string이라서 +가 연결연산자의 역할이므로, 숫자 두개가 합이 아니라 숫자 두개가 합쳐서 나온다.
		//연산하려면 데이터를 변환하면 된다.
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		//클래스를 쓰려면 new를 쓰려면 메모리에 올리고 변수 이름을 새로 만들었었는데, 왜 바로 쓰지?
		//정해져 있는 스펙이 있기 때문에 이렇게 사용하는 것이다.
		System.out.println("합->" + (num1+num2));

	}

}
