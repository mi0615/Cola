package c_control;

public class Ex05_for과제2 {

	public static void main(String[] args) {
		for(int i = 0; i<= 26 ; i--) {
			for(char x = (char)('A'-i); x <= 'Z'; x-- ) {
				System.out.print(x);
			}
			System.out.println();
		}

	}

}
