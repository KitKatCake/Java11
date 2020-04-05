package Little;

public class AnonymousDemo {
    public static void main(String[] args) {
        Age obj = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is "+x);
            }
        };
        obj.getAge();
    }
}
