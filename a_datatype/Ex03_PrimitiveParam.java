package a_datatype;

public class Ex03_PrimitiveParam {

	// call by value : 합수로 인자로 기본형 데이타를 보낼 때 / 결과값을 새로 저장하고 결과가 끝나면 사라진다.
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		add(a, b);
		System.out.println("2 > " + a); //10
		System.out.println("2 > " + b); //20
	}
	
	static void add(int a , int b) { 
		a += b; 
		System.out.println("1 > " + a); //30
	}

}
