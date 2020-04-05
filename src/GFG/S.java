package GFG;

import java.util.AbstractSet;
import java.util.TreeSet;

public class S {
    public static void main(String[] args) throws Exception{
        //Using clear() metod

/*        ArrayList<String> list = new ArrayList<>();

        // Adding elements of list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("Gaurav");

        // printing initial value ArrayList
        System.out.println("ArrayList: " + list);

        // print size of ArrayList
        System.out.println("Size of ArrayList = "
                + list.size());

        // remove all elements using clear() method
        list.clear();

       // list.removeAll(list);

        // printing ArrayList
        System.out.println("\nAfter clear\n\n"
                + "ArrayList: " + list);

        // print size of ArrayList after clear list
        System.out.println("Size of ArrayList = "
                + list.size());


 */
try{
        AbstractSet<Integer> abs_set = new TreeSet<>();

        abs_set.add(1);
        abs_set.add(1);
        abs_set.add(2);
        abs_set.add(3);
        abs_set.add(4);
        abs_set.add(5);

        // print abs_set
        System.out.println("AbstractSet: "
                + abs_set);
    }catch(Exception e) {
        System.out.println(e);
    }

}
}
