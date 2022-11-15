package com.yushuedu.Thread.AQS;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * CyclicBarrier
 * 赛阔里拜瑞
 *
 * 设置数量为2，当两个线程都执行结束了后，就会调用重写的run方法。
 * 不用重新再new一个cyclicBarrier
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        method1();
    }

    public static void method1() throws InterruptedException, BrokenBarrierException {
        CyclicBarrier cb = new CyclicBarrier(3, new Thread("barrierAction") {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " barrier action");
            }
        });
        MyTestThread t1 = new MyTestThread("t1", cb);
        MyTestThread t2 = new MyTestThread("t2", cb);
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName() + " going to await");
        cb.await();
        System.out.println(Thread.currentThread().getName() + " continue");

    }

    public static void method2(){
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");


        ExecutorService service = Executors.newFixedThreadPool(2);
        CyclicBarrier barrier = new CyclicBarrier(  2,()->{
//            log.debug("task1,task2 finish. . .");
            System.out.println(s.format(new Date())+" task1,task2 finish. . .");
        });
        for (int i = 0; i < 3; i++) {
            service.submit(() ->{
//                        log.debug("task1 begin. . .");
                System.out.println(s.format(new Date())+" task1 begin. . .");

                try {
                    Thread.sleep( 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    barrier.await();// 2-1=1
                }catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
            service.submit(() -> {
                System.out.println(s.format(new Date())+" task2 begin. . .");
                try {
                    Thread.sleep( 2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    barrier.await();// 1-1=0
                }catch (InterruptedException | BrokenBarrierException e){
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }
}