package z_extra개념;

public class DebugBasic {
	public static void main(String[] args) {
		int sum = 0;
		for( int i=2; i < 10; i+=2) {
			for( int j=5; j >=0; j--) {
				sum = i + j;
			}
		}

		System.out.println(sum);
	}
}

/**
	8 라인에서 커서 놓고 줄번호 앞에서 더블클릭하면 되지만
	메뉴 > Run > Toggle Breakpoint 선택하고
	디버깅 모드를 선택
	
	F6 (Step over)로 한 단계씩 진행하면서 변수를 확인한다
*/