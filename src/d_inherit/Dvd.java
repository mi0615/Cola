package d_inherit;

public class Dvd extends Item{
	
	private String actor;	
	private String director;
	
	public Dvd() {
		
	}
	
	public Dvd(int num, String title, String actor, String director) {
		super.num = num;
		super.title = title;
		this.actor = actor;
		this.director = director;
	}
	//*******overriding??
	public void output() {
		System.out.println("번호: " + num + ", 제목: "+ title+ " /배우: " + actor + " /감독");
		
	}
	
	

}
