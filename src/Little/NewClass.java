package Little;

public class NewClass {
    public static class superClass{
        static void print(){
            System.out.println("print in superclass.");
        }

    }
    public static class subClass extends superClass{
        static void print(){
            System.out.println("print in subclass.");
        }
    }

    public static void main(String[] args) {
        superClass A = new superClass();
        A.print();

        superClass B = new subClass();
        B.print();

    }
}
