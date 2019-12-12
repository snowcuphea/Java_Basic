package oop.chap07;

import java.util.Scanner;

public class IhAccountTest {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//체크계좌 만들기
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		
		System.out.println("카드번호입력:");
		String cardNo = key.next();

		acc1.pay(500000, "1234-5678-8888"); //위 카드넘버와 이 카드넘버 달라서 지불 불가
		System.out.println("현재잔액====>"+acc1.getBalance());//지불못해서 100만원 
		acc1.pay(500000, cardNo); //"1234-5647-8888"
		System.out.println("현재잔액====>"+acc1.getBalance());//지불해서 50만원
		
	}

}
//어카운트를 상속하는 체킹어카운트 만들기
//체킹어카운트의 변수는 카드넘버뿐이고, 나머지는 어카운트에서 상속해온다.
