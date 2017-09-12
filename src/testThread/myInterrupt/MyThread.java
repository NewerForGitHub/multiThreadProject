package testThread.myInterrupt;

public class MyThread extends Thread {

	@Override
	public void run() {
		// for(int i=0;i<500000;i++) {
		// if(this.isInterrupted()) {
		// System.out.println("线程已结束，当前坐标为:" + i);
		// break;
		// }
		// System.out.println("i=" + (i + 1));
		// }
		try {
			this.stop();
		} catch (ThreadDeath e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
