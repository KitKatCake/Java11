package Little;

public class NewClass2 {
    public static class superClass2{
        void print(){
            System.out.println("print in superclass.");
        }
    }
    public static class subClass2 extends superClass2{
        @Override
        void print(){
            System.out.println("print in subclass.");
        }
    }

    public static void main(String[] args) {
        superClass2 C = new superClass2();
        C.print();

        superClass2 D = new subClass2();
        D.print();
    }
}
