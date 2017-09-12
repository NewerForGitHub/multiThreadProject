package testThread.myPriority;

/**
 * 从运行结果看：<br>
 * setPriority会影响线程的运行效率
 *
 */
public class RunAB {

	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.setPriority(Thread.MIN_PRIORITY);
		a.start();

		ThreadB b = new ThreadB();
		b.setPriority(Thread.MAX_PRIORITY);
		b.start();
		
		Thread.sleep(2000);
		a.stop();
		b.stop();
		System.out.println("a=" + a.getCount());
		System.out.println("b=" + b.getCount());
	}
	
}
