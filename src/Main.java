import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public int apo = 10;
    public void BubbleSort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void print(int a[]){
        for(var p:a){
            System.out.println(p);
        }
    }

//    public int [] app(int a,int b,int c){
//        return (a>b)?(a>c?a:c):(b>c?b:c);
//    }


    enum Rating {UNRATED,G,PG,PG13,R,NC17}
    public static void main(String[] args) {
//        for(EnumTest e:EnumTest.values()){
//            System.out.println(e.toString());
//        }


//        Class clz = Rating.class;
//
//        for(Object obj:clz.getEnumConstants()){
//            System.out.println(obj);
//        }
//        System.out.println("------------------");
//        for(Rating rating:Rating.values()){
//            System.out.println(rating
//            );
//        }
//


        int arr[] = {10,20,56,89,78,45,46};


        Main ma = new Main();

        ma.BubbleSort(arr);

        ma.print(arr);


        System.out.println(ma.apo); //10


        List<Integer> list = new ArrayList<>();

        list.add(10);

        list.add(20);

        list.add(56);

        list.add(89);

        list.add(78);

        list.add(45);

        list.add(46);

       // list.sort(Comparator.comparingInt());

        list.stream().sorted().forEach(System.out::println);

        Set<Integer> set = new TreeSet<>();

//        Set<Character>

        set.add(10);

        set.add(20);

        set.add(56);

        set.add(89);

        set.add(78);

        set.add(45);

        set.add(46);

        for(var p:set){
            System.out.println(p);
        }







    }

}
