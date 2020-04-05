import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static int[] print(int[] a){
       for(int i:a)
           System.out.println(i);
       return a;
    }
    public static void main(String[] args) {
//    int b[] = {1020,20,30,40};
//
//    print(b);
//
//
//        ArrayList<Object> arrayList = new ArrayList<>();
//
//        arrayList.add(10);
//        arrayList.add("string");
//        arrayList.add(1.02);
//        arrayList.add('a');

//        for(var a:arrayList){
//            System.out.println(a);
//        }

//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//
//        Iterator<Object> iterator = new Iterator<Object>(arrayList);
//
//        if(iterator.hasNext()){
//            iterator.next();



//        List<String> list = Arrays.asList("abc","","bc","efg","abcd","","jkl");
//
//        List<String> filtered = list.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
//
//        filtered.forEach(System.out::println);

//        Random random = new Random();

//        System.out.println(random);

//        random.ints().limit(10).forEach(System.out::println);
//        random.ints().limit(10).sorted().forEach(System.out::println);

//        List<Integer> lst = Arrays.asList(1,3,5,7,9,2,4,6,8,10,11,18,65,75,45,21).stream().sorted().collect(Collectors.toList());
//
//        lst.forEach(System.out::println);

//        Stream.of(1,3,5,7,9,2,4,6,8,10).filter(p-> p%2==0).forEach(System.out::println);
        Stream.of(1,3,5,7,9,2,4,6,8,10).filter(p-> p%2!=0).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
//        hash_map.put(10, "Geeks");
//        hash_map.put(15, "4");
//        hash_map.put(20, "Geeks");
//        hash_map.put(25, "Welcomes");
//        hash_map.put(30, "You");
//
//        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + hash_map);
//
//        // Using entrySet() to get the set view
//        System.out.println("The set is: " + hash_map.entrySet());

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Iterator to traverse the list
//        Iterator iterator = list.iterator();
//
//        System.out.println("List elements : ");
//
//        while (iterator.hasNext())
//            System.out.print(iterator.next() + " ");
//
//        System.out.println();

        ListIterator iterator = list.listIterator();

        // Traversing the list in forward direction
        System.out.println("Displaying list elements in forward direction : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

        // Traversing the list in backward direction
        System.out.println("Displaying list elements in backward direction : ");

        while (iterator.hasPrevious())
            System.out.print(iterator.previous() + " ");

        System.out.println();




    }
}


