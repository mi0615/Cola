package d_inherit;

public class Book extends Item {
	
	private String author;
	private String publisher;
	
	public Book() {
		System.out.println("Book 인자없는 생성자");
		
	}
	
	public Book(int num, String title, String author, String publisher) {
		//super.num = num;
		//super.title = title;
		super(num, title);  //  *this()와 super() 무조건 첫줄에 기술
		
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자 있는 생성자");
	}
	
	public void output() {
		System.out.println("번호: " + num + ", 제목: "+ title + "/작가:" + author + "/출판사 :" + publisher);
		
	}
	
		
	

}
