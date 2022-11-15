package com.yushuedu.Thread;


//import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//@Slf4j(topic = "c.Demo03FutureTask")

public class Demo03FutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //new futureTask()
        //重写callable call方法
        //new thread(futuretask)
        //start()
        FutureTask<Integer> futureTask = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
//                log.debug("running.....");
                System.out.println("running.....");
                Thread.sleep(30000);
                return 100;
            }
        });

        Thread t1 = new Thread(futureTask, "t1");
        t1.start();
//        log.debug("{}",futureTask.get());
        System.out.println(futureTask.get());
    }
}
