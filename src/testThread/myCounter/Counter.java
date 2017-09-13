package testThread.myCounter;

public class Counter {

    public static volatile Integer count = 0;

    public static Object obj = new Object();

    public static void inc() {

        // 这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }

        Counter.count = Counter.count + 1;
    }

    public static void main(String[] args) {

//		while (true) {
        // 同时启动1000个线程，去进行i++计算，看看实际结果

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // Callable<ICount> c1 = () -> () -> {
                    // try {
                    // Thread.sleep(1);
                    // } catch (InterruptedException e) {
                    // }
                    // count++;
                    // };
                    // try {
                    // c1.call().inc();
                    // } catch (Exception e) {
                    // e.printStackTrace();
                    // }
                    Counter.inc();
                }
            }).start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 这里每次运行的值都有可能不同,可能为1000
        System.out.println("运行结果:Counter.count=" + Counter.count);
        try {
            Thread.sleep(2000);
            Counter.count = 0;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

//}

interface ICount {
    void inc();
}