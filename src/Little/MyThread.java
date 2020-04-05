package Little;

public class MyThread {
    public static void main(String[] args) {
      /*  Thread t = new Thread(){
            public void run(){
                System.out.println("Child Thread");
            }
        };
        t.start();
        System.out.println("Main Thread");

       */
      Runnable r = new Runnable() {
          @Override
          public void run() {
              System.out.println("Child Thread1");
          }
      };
      Thread t = new Thread(r);

      t.start();

        System.out.println("Main Thread1");

      new Thread(new Runnable() {
          @Override
          public void run() {
              System.out.println("Child Thread2");
          }
      }).start();


      new Thread(()-> System.out.println("This is a Thread!")).start();

      new Thread(()->{
          for (int i = 0; i < 10; i++) {
              System.out.println(Thread.currentThread().getName()+i);
          }
      }).start();
    }
}
