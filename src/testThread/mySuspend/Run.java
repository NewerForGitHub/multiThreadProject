package testThread.mySuspend;

/**
 * 该方法的缺点：<br>
 * 1.独占公共对象，其他线程无法访问<br>
 * 2.数据不同步，有点类似于数据库的数据完整性<br>
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		Thread.sleep(5000);
		
		//A段
		mt.suspend();
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());
		Thread.sleep(5000);
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());

		//B段
		mt.resume();
		Thread.sleep(5000);
		
		//C段
		mt.suspend();
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());
		Thread.sleep(5000);
		System.out.println("A=" + System.currentTimeMillis() + " i=" + mt.getI());
	}
}
