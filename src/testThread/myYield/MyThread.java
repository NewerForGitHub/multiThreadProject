package testThread.myYield;

/**
 * Thread.yield()表示暂停线程，放弃当前CPU资源<br>
 * <b>但是放弃的时间不确定，可能刚刚放弃，又会立刻获取CPU时间片</b>
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		int count = 0;
		for(int i=0; i<5000000; i++) {
//			Thread.yield();
			count += i +1;
		}
		System.out.println("count = " + count);
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - start) + "ms");
	}

}
