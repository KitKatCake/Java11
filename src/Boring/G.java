package Boring;

import java.util.*;

public class G {
    static void insertAndPrint(AbstractMap<Integer,String> map){
        int[] array= {1, -1, 0, 2,-2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
        for (int k: map.keySet())
        {
            System.out.print(k + ", ");
        }
    }

    //Using LinkedHashSet
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        Set<T> set = new LinkedHashSet<>();

        set.addAll(list);

        list.clear();

        list.addAll(set);

        return list;
    }
    public static void main(String[] args) {

       // HashMap<Integer,String> map = new HashMap<>();
      //  insertAndPrint(map);


        /*
        HashMap<Integer,String> ht = new HashMap<>();

        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(104,"Amit");  // hash map allows duplicate values
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

         */

        //Using java 8 Stream.distinct()

        /*
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);

        // Construct a new list from the set constucted from elements
        // of the original list
        List<Integer> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);

*/


        ArrayList<Integer>
                list = new ArrayList<>(
                Arrays
                        .asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);

        // Remove duplicates
        ArrayList<Integer>
                newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);


    }
}
