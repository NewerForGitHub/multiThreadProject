package testThread.myThread;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread thread = new Thread(c);
		thread.setName("A");//修改的是thread的进程名，不是c的
//		c.setName("B");
		thread.start();//这里是由thread线程调用c的线程
	}
	
}
