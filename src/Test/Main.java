package Test;

public class Main {
    static int[] getSumAndSub(int a,int b){
        int []ans = new int[2];
        ans[0] = a+b;
        ans[1] = a-b;

        return  ans;
    }
    public static boolean fun(Object obj,String c) throws ClassNotFoundException {
        return Class.forName(c).isInstance(obj);
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Integer i = Integer.valueOf(10);

        System.out.println(i instanceof Integer);

      //  System.out.println(i instanceof String);

        System.out.println(i instanceof Number);

        boolean b = fun(i,"java.lang.Integer");

        boolean b1 = fun(i,"java.lang.String");

        boolean b2 = fun(i,"java.lang.Number");

//        System.out.println(b);
//        System.out.println(b1);
//        System.out.println(b2);

        int []ans = getSumAndSub(100,50);
        System.out.println("Sum = " + ans[0]);
        System.out.println("Sub = " + ans[1]);

    }
}
