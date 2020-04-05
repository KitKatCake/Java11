package Pak;

public class Main {

    public int operate(int a, int b, FunIter funIter) {
        return funIter.operation(a, b);
    }

    public static void main(String[] args) {
//        Derived derived = new Derived();
        Derived derived = new Derived(10, 20);
        //derived.Display();
        /*

        FuncInterface fobj = (int x)->System.out.println(2*x);

        fobj.abstractFun(5);

        fobj.normalFun();

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));

        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });


         */
        FunIter add = (x, y) -> x + y;
        FunIter multiply = (x, y) -> x * y;

        Main ma = new Main();

        System.out.println("Addition is " +
                ma.operate(6, 3, add));

        System.out.println("Multiplication is " +
                ma.operate(6, 3, multiply));

        FunIter2 funIter2 = message -> System.out.println("Hello "
                + message);
        funIter2.sayMessage("Geek");

    }
}
