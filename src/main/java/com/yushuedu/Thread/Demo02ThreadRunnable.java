package com.yushuedu.Thread;

public class Demo02ThreadRunnable {
    public static void main(String[] args) {
        //创建一个Runnable 接口的实现类
        //1重写Runnable实现类的 run()方法
        //new Runnable 接口的实现类
        //new Thread(实现类)
        //调用start方法
        Runnable runnable = new RunnableHelloImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }

        //runnable和thread 的区别主要是继承和接口的区别。

    }
}
