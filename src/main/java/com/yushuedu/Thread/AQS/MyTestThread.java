package com.yushuedu.Thread.AQS;

import java.util.concurrent.CyclicBarrier;

public class MyTestThread extends Thread{

    private CyclicBarrier cb;
    public MyTestThread(String name, CyclicBarrier cb) {
        super(name);
        this.cb = cb;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " going to await");
        try {
            cb.await();
            System.out.println(Thread.currentThread().getName() + " continue");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
