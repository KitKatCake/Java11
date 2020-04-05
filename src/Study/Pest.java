package Study;

public class Pest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread created!");
            }
        }).start();
        new Thread(()->{
            System.out.println("Another Thread created!");
        }).start();
    }
}
