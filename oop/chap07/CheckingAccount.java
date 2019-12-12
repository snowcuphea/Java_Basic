package oop.chap07;
//상위클래스를 하위클래스에서 객체형식으로 쓰면 안돼.
class CheckingAccount extends IhAccount{
	private String cardNo;
	
	public CheckingAccount() {
		
	}
	public CheckingAccount(String account,String ownerName, 
			int balance, String cardNo) {
		super(account, ownerName, balance); //super쓰려면 이거랑 똑같은 변수 3개 있는
		//생성자를 부모클래스에 만들어야됨!!!!!!!!!!
		this.cardNo = cardNo;
	}
	
	//문자열을 직접 비교하려면 무조건!!!!!! equals를 이용해서 비교한다. 
	public void pay(int amount, String cardNo ) {
		if(this.cardNo.equals(cardNo)){ 
			//this.cardNo == cardNo 이거는안됨. 배열같은 경우, 주소값이기 때문에
			//주소값 == 문자열 이렇게하면 틀린 상황이 온다. 
			
	
			if(amount <= getBalance()) {
				
				withdraw(amount);
				
			}else {
				System.out.println("지불 불가능, 잔액 부족");
			}
			
		}else {
			System.out.println("카드번호가 다릅니다.");
		}
	}
}
