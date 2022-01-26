package d_inherit;

public abstract class Item {
	
	protected int num;
	protected String title;
	
	public Item() {
		System.out.println("부모의 인자 없는 생성자");
	}
	
	public Item(int num, String title) {
		this.num = num;
		this.title = title;
		System.out.println("부모의 인자 있는 생성자");
	}
	
	
	//public void output() {
		//System.out.println("번호: " + num + ", 제목: "+ title);
		
	public abstract void output();
	
	
		//[주의] public void output(){}= 완벽한 함수 구현
	}


