package b_static;

public class MainApp {

	public static void main(String[] args) {
		//Book b1 = new Book();
		//System.out.println("책의 갯수: " + b1.getCount());
		//Book b2 = new Book();
		//System.out.println("책의 갯수: " + b2.getCount());
		//Book b3 = new Book();
		//System.out.println("책의 갯수: " + b3.getCount());
		
		
		
		System.out.println("책의 갯수: " + Book.getCount());
	}
}

/*
 *  ***************** static
 *  	- 메모리에 단 한개
 *  	- 공유
 *  	
 *  	- 객체명이 아닌 클래스명으로 접근 가능
 *  	- 
*/


/*
 * Integer i = new Integer();
 * i.parseInt();
 * 
 * Integer.parseInt();
 * 
 * -------------------------------
 * JVM
 * 		MainApp 클래스 안에 main() 실행
 * 
 * 		MainApp a = new MainApp();
 * 		a.main();
 * 
 * 		MainApp.main();
 */


