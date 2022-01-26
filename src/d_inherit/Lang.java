package d_inherit;

public class Lang {

	public Lang() {}
	public void hello() {
		System.out.println("인사말");
	}
	public void intro() {
		System.out.println("자기소개");
	}
	public void want() {
		System.out.println("하고픈말");
	}
	
}

class Kor extends Lang {
	@Override
	public void hello() {
		System.out.println("안녕하세요.");
	}
	@Override
	public void intro() {
		System.out.println("내 이름은 홍길동입니다.");
	}
	@Override
	public void want() {
		System.out.println("끝.");
	}
}

class Eng extends Lang {
	@Override
	public void hello() {
		System.out.println("Hello.");
	}
	@Override
	public void intro() {
		System.out.println("My name is Hong Gil Dong.");
	}
	@Override
	public void want() {
		System.out.println("The end.");
	}
	
}

class Jap extends Lang {
	@Override
	public void hello() {
		System.out.println("おはようございます.");
	}
	@Override
	public void intro() {
		System.out.println("私の名前はホンギルドンです.");
	}
	@Override
	public void want() {
		System.out.println("おしまい.");
	}
	
}