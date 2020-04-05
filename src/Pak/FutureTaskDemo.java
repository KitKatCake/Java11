package Pak;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        executor.submit(futureTask);
        executor.shutdown();

        try{
            Thread.sleep(1000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("主线程在执行任务");
        try{
            System.out.println("task运行结果"+futureTask.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("所有任务执行完毕");
    }
}
