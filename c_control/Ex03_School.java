package c_control;

import java.util.Scanner;
public class Ex03_School {

	public static void main(String[] args) {

		System.out.println("당신의 학번을 입력하세요. =>");

		Scanner schoolnum = new Scanner(System.in);
		String num = schoolnum.next();

		String year = num.substring(0,4);

		char dae = num.charAt(4);
		String subject = num.substring(5,7);
		String num2 = null;
		String num1 = null;

		if(dae == '1') { 
			num1 = "공대";


			switch(subject) {
			case "11" : 
				num2 = "검퓨터학과";
				break;
			case "12" :
				num2 ="소프트웨어학과";
				break;
			case "13" :
				num2 ="모바일학과";
				break;
			case "22" :
				num2 ="자바학과";
				break;
			case "33" :
				num2 ="서버학과";
				break;

			}
		} else if(dae == '2')  {
			num1 = "사회대";

			switch(subject) {
			case "11" :
				num2 = "사회학과";
				break;
			case "12" :
				num2 ="경영학과";
				break;
			case "13" :
				num2="경제학과";		 				 			


			}
		}
		System.out.println(num + "는 " + year + "년도에 입학한 " + num1 + num2 + "학생입니다.");
	}
}




