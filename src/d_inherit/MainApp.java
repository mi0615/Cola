package d_inherit;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Item i = null;
		
		System.out.println("종류를 선택하세요-> 1:책, 2:Dvd 3: Cd");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt();
		
		switch(sel) {
			case 1: i = new Book(100,"자바","김","코스모"); break;
			case 2: i = new Dvd(200,"좋은영화","김배우","박감독"); break;
			case 3: i = new Cd(300,"좋은노래","김가수"); break;
			//다른 종류별로 객체 생성
		}
		
		i.output(); // *******************
		
		
		//switch(sel) {
		//case 1: b.output(); break;
		//case 2: d.output(); break;
		//case 3: c.output(); break;
		// 종류별로 출력함수 호출
		
		
	}

}
