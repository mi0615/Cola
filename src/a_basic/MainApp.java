package a_basic;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		//Student s;         // 변수선언    Student 클래스명
		//s = new Student(); // 객체 생성   s 객체 명
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생이름->");
		String n = input.next();
		System.out.println("국어->");
		int k = input.nextInt();
		System.out.println("수학->");
		int m = input.nextInt();
		System.out.println("영어->");
		int e = input.nextInt();
		
		Student s = new Student(n, k, m, e);
		
		
		
		
		
		// 값 지정
		//s.name = "홍길동";
		//s.kor = 100;
		//s.eng = 90;
		//s.math = 80;
		//s.setName("홍길동");
		//s.setKor(100);
		//s.setEng(90);
		//s.setMath(80);
		
		s.calculateTotal();
		s.calculateAvg();
		s.output();
		
	}

}
