package Boring;

public class D extends Thread{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t.getName());
        t.setName("Geeks");
        System.out.println("After name change: " + t.getName());
        System.out.println("Main thread priority: "+ t.getPriority());
        t.setPriority(MAX_PRIORITY);
        System.out.println("Main thread new priority: "+ t.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
        ChildThread ct = new ChildThread();
        System.out.println("Child thread priority: "+ ct.getPriority());
        ct.setPriority(MIN_PRIORITY);
        System.out.println("Child thread new priority: "+ ct.getPriority());
        ct.start();



    }

}

