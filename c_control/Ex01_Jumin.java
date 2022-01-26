package c_control;

public class Ex01_Jumin {
	public static void main(String[] args) {
		
		String id = "800120-1234567"; 
		
		
		String year =  id.substring(0,2); //0번째 부터 2번째 앞까지 
		System.out.println("년도 : " + year);
		
		//월과 일도 추출해서 출력하기
		String month = id.substring(3,5);
		String day = id.substring(4, 6);
		System.out.println(month + "월" + day + "일");
		
		
		char hyun = id.charAt(7);
		//System.out.println(hyun);
		
		// 변수 hyun에 값이 1이거나 3이면 "남자" 출력
		// 그렇지 않으면 "여자" 출력
		if(hyun == '1' | hyun == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// 8번째 문자를 추출하여 변수 chul 에 저장하기
		
		char chul = id.charAt(8);
		// 0 - 서울태생
		// 1 - 인천/부산
		// 2 - 경기
		// 9 - 제주
		switch(chul) { //문자, 정수, 스트링 변수
			case '0' :
			System.out.println("서울태생");
			break;
			case '1' :
			System.out.println("인천/부산");
			break;
			case '2' :
			System.out.println("경기");
			break;
			case '9' :
			System.out.println("제주");
			break;
		}
		
	
	}

}
