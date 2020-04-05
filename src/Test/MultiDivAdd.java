package Test;

public class MultiDivAdd {
    int mul;
    double div;
    int add;

    MultiDivAdd(int m, double d, int a) {
        mul = m;
        div = d;
        add = a;
    }
}

class Test {
    static MultiDivAdd getMultDivAdd(int a, int b) {
        return new MultiDivAdd(a * b, (double) a / b, (a + b));
    }

    public static void main(String[] args) {
        MultiDivAdd ans = getMultDivAdd(10,20);
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
        System.out.println("Addition = " + ans.add);
    }

}
