package Study;

import java.util.Scanner;

public class TAX {
    public static void main(String ...args) throws ClassNotFoundException,IllegalAccessException,InstantiationException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state name");

        String state = sc.next();

        Class c = Class.forName(state);

        STax ref = (STax)c.newInstance();

    }
    static void calculateTax(STax t){
        double ct = 2000.0;

        double st = t.stateTax();
        double totaltax = ct + st;
        System.out.println("Total tax =" + totaltax);
    }
}
