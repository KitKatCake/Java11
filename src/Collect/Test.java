package Collect;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        boolean b1 = hs.add("Geeks");
        boolean b2 = hs.add("GeeksforGeeks");

        // adding duplicate element
        boolean b3 = hs.add("Geeks");

        // printing b1, b2, b3
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);

        // printing all elements of hashset
        System.out.println(hs);

    }
}
