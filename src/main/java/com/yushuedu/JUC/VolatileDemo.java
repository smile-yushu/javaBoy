package com.yushuedu.JUC;

public class VolatileDemo {
   volatile static  boolean  run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while (run){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("running...");
                }
            }
        };
        thread.start();

        Thread.sleep(1000);
        System.out.println("stop..");
        run = false;
    }
}
