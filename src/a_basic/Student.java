package a_basic;

public class Student {
	
	


	// 서로 다른 자료형 + 함수 ==> 클래스
	private String name;
	private int kor, eng, math;
	private int total = 0;
	private double avg;
	
	//------------------------------------
	// 생성자 함수 - 객체 초기화
	public Student() {   // void 넣으면 안됨
		name = "아무개";
		kor = 50;
		eng = 50;
		math = 50;
	}
	
	public Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}
	
	public void calculateTotal() {
		total = kor + eng + math;
	}
	
	public void calculateAvg() {
		avg = total / 3.;
	}
	
	public void output() {
		System.out.println("학생명 : " + name);
		System.out.println("총점 : " + total + ", 평균 : " + avg);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}


/*
 *  0) 클래스란
 *  	// 서로 다른 자료형의 멤버변수(field)와 멤버 메소드 => 클래스
 *  
 *  1)클래스와 객체의 관계
 *  
 *  2) 캡슐화
 *  	- 멤버변수 : private
 *  	- 멤버메소드 : public
 *  
 *  3) 객체 초기화 : 생성자 함수
 *  	생성자 함수는 new 하는 순간에 자동으로 불려지는 함수
 *  	이름이 반드시 클래스명과 동일
 *  	리턴형이 없음 ( 주의 !!!!!!! void 안됨 )
 *  
 *  4) overroding
 *  	동일한 함수명으로 여러개의 함수 선언
 *  	-> 인자의 자료형이나 갯수가 다른 동일한 이름의 함수들
 */

/*
 *  [참고] 초기화
 *  	 int a ; //변수선언 -> 메모리 확보
 *  	 a = 10; // 값을 지정
 *  
 *  	 int b = 20; // 변수선언(즉, 메모리 확보 )하면서 값을 처음부터 지정 => 초기화
 *   */



/*
// 클래스명은 첫글자는 대문자 ( 권장사항 )
// 변수명은 첫글자는 소문자
// 함수명은 첫글자는 소문자
// 라벨명은 전체다 대문자
// 패키지명 전체다 소문자

// 영단어로 첫글자를 대문자 -> 낙타표기법 ( camel-case )
// ex) 원을 그리는 함수 : drawCircle
*/
