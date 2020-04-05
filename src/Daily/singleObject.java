package Daily;

public class singleObject {
    private static singleObject instance = new singleObject();

    private singleObject() {
    }
    public static singleObject getInstance() {
        return instance;

    }
    public void showMeassage(){
        System.out.println("Hello World!");
    }
}

