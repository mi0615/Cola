package c_control;

import java.util.Scanner;
public class Ex02_Jumsu {

	public static void main(String[] args) {

		int score = 0;
		
		System.out.println("당신의 점수를 입력하세요=>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		System.out.println("당신의 점수는 " + score);
		System.out.println("당신의 점수는 " + score/10); //int와 int => 결과는 int
		
		switch(score / 10) {
			case 9 : System.out.println("A학점");
			break;
			
			case 8 : System.out.println("B학점");
			break;
			
			case 7 : System.out.println("c학점");
			break;
			
			default : System.out.println("F학점");
			break;
		}
		
	}

}
