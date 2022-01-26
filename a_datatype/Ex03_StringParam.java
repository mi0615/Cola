package a_datatype;

public class Ex03_StringParam {

	//String 만의 특성 - 결과값의 객체를 다시 만들어서 새로운 번지를 저장한다.
	public static void main(String[] args) {
		String a = "Hello";
		String b = "홍길동";
		add(a, b);
		System.out.println("2 > " + a); //Hello
		System.out.println("2 > " + b); //홍길동
	}
	
	static void add(String a, String b) {
		// String 특권
		a += b;  // a = a+b;
		System.out.println("1 > " + a); //Hello 홍길동
    }
	
	//우선 - static 메소드에서는 static만 참조할 수 있다.
}
