package c_inherit;

public class MainApp {

	public static void main(String[] args) {
		
		//1
		//Mama m = new Mama();
		//m.gene();
		//m.job();
		
		//Ddal d = new Ddal();
		//d.gene();
		//d.study();
		//*
		//d.job();
		
		
		//2
		// 부모 변수에 자식 객체 생성
		Mama z = new Ddal();
		z.job();
		//z.study(); 안됨
		z.gene(); // *****부모껄 불러와야하지만 부모껄 오버라이딩했으니 자식껄 불러옴. 기본적으로 메모리는 자식까지 가지고 있지만 부모껏만 참조함
		
		//3
		// 형변환 - 기본형끼리
		//		- 클래스끼리 (상속관계일 때만 가능)
		
		Ddal dd = new Ddal();
		Mama mm = (Mama)dd;		// upcasting
		Ddal dd2 = (Ddal)mm;	// downcasting
	}

}
