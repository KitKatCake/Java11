package Boring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=0;i<10;i++){
            list.add(i);
        }

        Iterator iterator = list.iterator();

 //       while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        List lst = new ArrayList();

        lst.add("123");
        lst.add("456");
        lst.add("789");

        Iterator iter = lst.iterator();

        while(iter.hasNext()){
            String value = (String) iter.next();
            if(value.equals("456")){
                iter.remove();
            }
        }
        for (var p:lst){
            System.out.println(p);
        }
    }
}
