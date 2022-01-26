package c_control;

public class Ex05_for과제4 {

	public static void main(String[] args) {
		for(int i = 0; i<26; i++) {
			for(char x = 'Z'; x >= 'Z'- i 
					; x--) {
				System.out.print(x);
				
			}
			System.out.println();
		}
	}

}
