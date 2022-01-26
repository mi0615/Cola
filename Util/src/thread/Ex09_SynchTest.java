

package thread;

class Count{
	int i;                            //thread가 동시에 처리하므로 중간에 결과값을 
	void increment () { //synchronized 는 락을 걸어서 끝까지 결과가 나오게 한다
		synchronized(this) { i++; }  
		//(1) read i
		//(2) i+1
		//(3) write i
	}
}

class ThreadCount extends Thread{
	Count cnt;
	ThreadCount(Count cnt) {
		this.cnt = cnt;
	}
	public void run() {
		for(int i = 0; i<10000000; i++) {
			cnt.increment();
		}
	}
}


public class Ex09_SynchTest {

	public static void main(String[] args) {

		Count count = new Count();
		ThreadCount tc1 = new ThreadCount(count);
		tc1.start();

		ThreadCount tc2 = new ThreadCount(count);
		tc2.start();

		try {
			tc1.join();
			//tc2.join();
		}catch(Exception ex) {

		}



		System.out.println("최종 i의 결과 : " + count.i);
	}

}

