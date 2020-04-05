package Pak;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"正在执行 ...");
    }

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        Thread thread4 = new MyThread();
        Thread thread5 = new MyThread();

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);

        executorService.shutdown();



    }



}
