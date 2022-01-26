package c_control;

public class Ex05_for과제1 {

	public static void main(String[] args) {
		
		for(int i = 0; i<26; i++) {
			for(char ch ='A'; ch <= 'Z'-i; ch++) {
			System.out.print(ch);
			} //end of for ch
		System.out.println();
		}//end of for i
	} //end of for main

} //end of class
