package c_control;
import java.util.Scanner;
public class Ex05_for연습2 {

	public static void main(String[] args) {
		
		System.out.println("자연수를 입력하세요 => ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 0; i<=n ; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.printf("%3s", " ");
			}
			for(int k = 1; k <= +3 ; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
