package d_inherit;

public class Cd extends Item {
	
	private String singer;
	
	public Cd () {
		
	}
	
	public Cd(int num, String title, String singer) {
		super.num = num;
		super.title = title;
		this.singer = singer;
	}
	
	public void output() {
		System.out.println("번호: " + num + ", 제목: "+ title + "/가수:"+ singer);
		
	}

}
