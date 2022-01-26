package c_control;

import java.util.Scanner;
public class Ex05_for연습1 {

	public static void main(String[] args) {
		
		System.out.println("자연수를 입력하세요 =>");		
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=n-j;i++) {
				System.out.printf("%3s"," ");
			}
			for(int k = 1; k <=j ; k++) {
				System.out.printf("%3d",k);
			}
			System.out.println();
		}
		
	}

}
