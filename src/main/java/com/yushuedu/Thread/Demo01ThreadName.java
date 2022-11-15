package com.yushuedu.Thread;

public class Demo01ThreadName {

    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        //创建一个thread 的子类
        //重写thread子类 run()方法
        //new thread类的子类对象
        //调用start方法
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("线程名称"+myThread.getName());
        System.out.println("当前线程名称"+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("main:"+i);
        }
    }

    public static void method2(){
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("t1:"+Thread.currentThread().getState());
                System.out.println("running...");
                System.out.println("t1:"+Thread.currentThread().getState());

            }
        };
        System.out.println("main:"+t1.getState());
        t1.start();
        System.out.println("main:"+t1.getState());

    }
}
