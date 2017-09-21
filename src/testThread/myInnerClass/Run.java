package testThread.myInnerClass;

import testThread.myInnerClass.OutClass.InnerClass1;
import testThread.myInnerClass.OutClass.InnerClass2;

public class Run {
    public static void main(String[] args) {
        final InnerClass1 in1 = new InnerClass1();
        final InnerClass2 in2 = new InnerClass2();
        new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);//对象监视器是in2
            }
        }, "T1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();//对象监视器是in1,因此和in1.method1(in2)方法是异步执行的
            }
        }, "T2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();//对象监视器是in2,因此和in1.method1(in2)方法是同步执行的
            }
        }, "T3").start();
    }
}
