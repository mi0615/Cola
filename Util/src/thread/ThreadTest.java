package thread;

public class ThreadTest { //동시작업하는것처럼 보이기 떄문에 결과가 다르게 나옴 

	public static void main(String[] args) {

		MakeCar1 mc1 = new MakeCar1("차틀만들기");
		mc1.start(); //start() -> run 호출

		MakeCar1 mc2 = new MakeCar1("엔진부착");
		mc2.start
		();

		System.out.println("프로그램 종료");

	}

}

class MakeCar1 extends Thread{
	String work;
	MakeCar1(String work) {
		this.work = work;
	}
	public void run() { //오버라이딩한 상태
		for(int i = 0 ; i <5; i++) {
			System.out.println(work + "작업중");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}