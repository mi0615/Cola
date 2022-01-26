package z_extra개념;


public class DebugFunc {

	public static void main(String[] args) {
		String str = "문자";
		int num = 100;
		
		for( int i=1; i < 5; i++) {
			str = str + i;
			num = num + fun1();
			num = num + fun2();
		}
		
		System.out.println(str);
		System.out.println(num);
	}
	
	static int fun1() {
		int f1 = 11;
		return f1;
	}
	
	static int fun2() {
		int f2 = 55;
		return f2;
	}
	
}

/**
F6 (Step over)로 한 단계씩 진행하면서 변수를 확인한다
F5 (Step in)은 함수 안에 들어가서 확인
*/