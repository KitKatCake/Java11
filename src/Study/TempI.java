package Study;

public interface TempI {
    public abstract void mul(int a, int b);

    public default void add(int a, int b) {
        sub(a, b);
        div(a,b);
        System.out.print("Answer by Default method = ");
        System.out.println(a + b);
    }

    public static void mod(int a, int b) {
        div(a, b);
        System.out.print("Answer by Static method = ");
        System.out.println(a % b);
    }

    public static void sub(int a, int b) {
        System.out.print("Answer by Private method = ");
        System.out.println(a - b);

    }

    public static void div(int a, int b) {
        System.out.print("Answer by Private static method = ");
        System.out.println(a / b);
    }
}
