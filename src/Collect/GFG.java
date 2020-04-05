package Collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GFG {
    public static <T> Set<T> mergeSet(Set<T> a, Set<T> b){
        return new HashSet<T>(){{
            addAll(a);addAll(b);
        }};
    }

    public static <U> void iList(List<U> list){

    }

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 }));

        // Second set
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));
       // b.addAll(Arrays.asList(0, 2, 4, 6, 8 ));

        // Printing the sets
        System.out.println("Set a: " + a);
        System.out.println("Set b: " + b);

        // calling mergeSets()
        System.out.println("Merged Set: " + mergeSet(a, b));
    }
}
