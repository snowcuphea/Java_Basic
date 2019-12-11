package oop.chap06.constructor;

public class MyConstructor {
	//생성자메소드는 접근 제한을 어떻게 걸어야 할까?
	// public 으로 해야한다.
	//내부에서만 사용되는게 아니라, 다른 패키지에서도 접근이 가능해야 하므로 public
	//내부에서만 쓰려면? default로 접근제한 걸면 된다.
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	
	public MyConstructor() {
		System.out.println("기본생성자");
	}
	
	//로그인용
	//생성자를 직접 생성해보자, 리턴타입은 없다. (void도 쓰지 않음) 메소드명은 클래스명과 같아야한다.
	public MyConstructor(String name, String id, String pass) {
		System.out.println("매개변수 3개 생성자");
		this.name = name;
		this.id = id;
		this.pass = pass; // setter메소드 3개 호출한 거랑 같다.
		//그렇다고 해서 setter메소드가 필요없는 것은 아니다.
		//회원가입 같은 거 할 때 처럼 한꺼번에 받을 때 사용
		//setter는 이미 받아진 객체에서 하나씩만 가져와서 수정할 때 사용
	}
	
	//수정용
	public MyConstructor(String name, String id, String pass, 
			String nickname ) {
		this(name, id, pass); //기존에 작성해 놓은 매개변수 3개의 생성자를 호출
		System.out.println("매개변수 4개 생성자");
		this.nickname = nickname;	
	}
	
	//수정용
	public MyConstructor(String name, String id, String pass, 
			String nickname, String addr ) {
		this(name, id, pass, nickname);
		System.out.println("매개변수 5개 생성자");
		this.addr = addr;
	}
	
	//조회용
		public MyConstructor(String name, String id, String pass, 
				String nickname, String addr, int point ) {
			this(name, id, pass, nickname, addr);
			System.out.println("매개변수 6개 생성자");
			this.point = point;
		}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
