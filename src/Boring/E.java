package Boring;

import java.util.*;

public class E {
    public static void main(String[] args) {
        /*try{
            System.out.println("Entering into Deadlock");
            Thread.currentThread().join();
            System.out.println("This statement will never execute");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

         */


       /* ArrayList<String> al = new ArrayList<>();

        al.add("Practice.GeeksforGeeks.org");
        al.add("quiz.GeeksforGeeks.org");
        al.add("code.GeeksforGeeks.org");
        al.add("contribute.GeeksforGeeks.org");

        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        Vector<String> v =new Vector<>();

        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");

        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());




        */
        List<Integer> lst = new ArrayList<>();

        lst.add(1);
        lst.add(11);
        lst.add(1);

        boolean p = lst.contains(3);

        System.out.println(p);




    }
}
