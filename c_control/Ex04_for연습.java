package c_control;

public class Ex04_for연습 {

	public static void main(String[] args) {
		
		/*        1    2-5    4-7
		 * for (초기치; 조건문 ; 증가치) {
		 *   반복문장 3-6
		 * }
		 */
		for(int j = 0; j<4; j++) {
			
		for(int i = 0; i<5; i++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i =0; i<5; i++ ) {
			System.out.print(i);
		}
		System.out.println();
		
		for(char i = 'A';i<='Z' ;i++) {
			System.out.print(i);
			
		}
        System.out.println();
		
		for(char i = 'A';i<='Z' ;i+=2) {
			System.out.print(i);
		}
		
		System.out.println();
		
		for(char i = 'Z'; i>='A' ; i--) {
			System.out.print(i);
		}
	}

}
