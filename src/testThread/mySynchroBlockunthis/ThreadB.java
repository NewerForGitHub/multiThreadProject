package testThread.mySynchroBlockunthis;

public class ThreadB extends Thread {

	private Task task;

	public ThreadB(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		task.doShortTimeTask();
	}

}
