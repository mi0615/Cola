package a_datatype;

public class Ex01_Valueable {

	public static void main(String[] args) {
		int age;
		double weight;
		
		String name; //Sting name = new String;
		//char []name;
		
		//double f = 3.6;
		//casting
		float f = (float)3.6;
		System.out.println("f = " + f);
		
		int d = (int)3.6;
		System.out.println("d = " + d);
		
	}

}

/* 
	1. 변수 - 값을 저장하기 위해 메모리에 공간의 이름
	
	2. 자료형 (datatype)
		(1) 기본형
			- 논리형 : boolean
			- 문자형 : char(4B)
			- 정수형 : int(4B)  / long(8B)
			- 실수형 : float(4B), double(8B) 
		(2) 참조형
			- 배열 / 클래스
			- new 연산자로 객체 생성
			-------------------------------------
			(*) String 클래스는 예외
			String a = new String();
			String b; // String b = new String();
			
*/