package a_datatype;

public class Ex03_StringBuffer {

	//call by reference : 함수의 인자로 참조형르 보낼 때 / 결과값이 변형된 것으로 값을 저장한다.
	// [결론] 원데이타가 변경
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("홍길동");
		add(a, b);
		System.out.println("2 >" + a); //Hello 홍길동
		System.out.println("2 >" + b); //홍길동

	}
	
	  static void add(StringBuffer a, StringBuffer b) {
		  a.append(b);
		  System.out.println("1 >" + a); //Hello 홍길동

	  }

}
/*
 	자바에서 문자열처리 클래스
 	- String 
 	- StringBuffer / StringBuilder
 
*/