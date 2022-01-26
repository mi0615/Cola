package thread;

public class Ex02_Runnable {

	public static void main(String[] args) {
		MakeCar2 mc1 = new MakeCar2("차틀만들기");
		Thread t1 = new Thread(mc1);
		t1.start();
		
		//----------------------------------
		new Thread(new MakeCar2("엔진부착")).start(); //위에 원본을 줄일수 있음
	}

}

class MakeCar2 implements Runnable{
	String work;
	MakeCar2(String work) {
		this.work = work;
	}
	public void run() { //오버라이딩한 상태
		for(int i = 0 ; i <5; i++) {
			System.out.println(work + "작업중");
		try {
			Thread.sleep(500); 
		}
		 catch (InterruptedException e) {
		e.printStackTrace();
		}
	
	}
}
}