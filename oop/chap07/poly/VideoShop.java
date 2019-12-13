package oop.chap07.poly;
public class VideoShop {//Video가 Contents상속
	public static void main(String[] args) {
		Content[] content = new Content[3]; //부모타입의 배열 선언
		content[0] = new Video("기생충","new"); 
		content[1] = new Video("탐정","comic");
		content[2] = new Video("헬로카봇","child");
		
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
