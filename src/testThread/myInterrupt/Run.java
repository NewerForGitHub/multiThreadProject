package testThread.myInterrupt;

/**
 * stop方法会导致数据不一致的情况
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1000);
		t.interrupt();
		System.out.println("是否停止1：" + t.isInterrupted());
		System.out.println("是否停止2：" + t.isInterrupted());
	}

}
