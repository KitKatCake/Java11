package Boring;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class B {
    public static void main(String[] args) {
     /*   List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(2);
        lst.add(9);
        lst.add(7);

        Collections.sort(lst);

        for (var p:lst){
            System.out.println(p);
        }
*/
//        List list = new ArrayList();

        List<String> list = new ArrayList<>();

      /*  list.add("one");
        list.add("two");
        list.add("three");
*/
        list.add("One");
        list.add("Abc");
        list.add("BCD");
        /*Collections.sort(list, (String a, String b) -> {
            return b.compareTo(a);
        });*/
        Comparator<String> comparator = (String a,String b)->{
            return  a.compareTo(b);
        };
        Comparator<String> comparatorReversed = comparator.reversed();

        Collections.sort(list,comparatorReversed);


       // Collections.sort(list);
        System.out.println(list);

        //Stream<String> stream = list.stream();

        //stream.forEach(System.out::println);

        Function<Integer,Integer> multiply = (value)->value*2;
        Function<Integer,Integer> add = (value)->value+3;

//        Function<Integer,Integer> addThenMultiply = multiply.compose(add);
        Function<Integer,Integer> multiplyThenadd = multiply.andThen(add);

//        Integer result = addThenMultiply.apply(3);
        Integer result = multiplyThenadd.apply(3);

        System.out.println(result);
/*
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX   = (text) -> text.endsWith("x");
        Predicate<String> composed = startsWithA.and(endsWithX);

        String input = "A hardworking person must relax";
        boolean result = composed.test(input);
        System.out.println(result);
  */


        Predicate<String> startsWithA = (text)->text.startsWith("A");
        Predicate<String> endsWithX = (text)->text.endsWith("X");
        Predicate<String> composed = startsWithA.or(endsWithX);

        String input = "A hardworking person must relax sometimes";

        boolean result2 = composed.test(input);



         //var p = (param)->{System.out.println("param: "+param);
         //return "return value"; };



    }
}
