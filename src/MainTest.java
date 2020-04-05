import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class MainTest {
    public static void main(String[] args) {
//        Stream.of(1,2,3,4).forEach(System.out::println);
//        Stream.of(1,2,3,4).filter()

        String s = new String("abc");

        String s1 = "abc";

        System.out.println(s==s1);

        System.out.println(s.equals(s1));

        ArrayList<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

//        System.out.println(list.size());
//        System.out.println(list.size());
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println(list.get(1));


        HashMap<String,Integer> hashMap = new HashMap<String,Integer>(5);

        hashMap.put("1",1);
        hashMap.put("2",2);
        hashMap.put("3",3);
        hashMap.put("4",4);
        hashMap.put("5",5);



    }
}
