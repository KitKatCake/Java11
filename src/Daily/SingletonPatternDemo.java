package Daily;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        singleObject singleObject = Daily.singleObject.getInstance();
        singleObject.showMeassage();
    }
}
