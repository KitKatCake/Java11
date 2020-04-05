import javax.naming.StringRefAddr;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.getType;

public class Simple<T> {
    T print(T context){

        return context;
    }
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);

        Simple<String> s = new Simple<>();
        Simple<Float> s2 = new Simple<>();
        Simple<Integer> s3 = new Simple<>();

//        System.out.println(s.print("string"));
//        System.out.println(s2.print(12.1f));
//        System.out.println(s3.print(10));

//        List<Integer> list = new ArrayList<Integer>();
//        int []a = new int[1000];
//        int sum = 0;
//        for(int i=0;i<101;i++){
//            a[i] = i;
//            if(a[i]%2!=0){
//                sum += a[i];
//            }
//        }
//        System.out.println(sum);

//        System.out.println(Stream.of("abc","avfg","ghykooo","po","l").filter(p->p.length()>2).count());
//
//
//        Stream.of("abc","avfg","ghykooo","po","l").filter(p->p.length()>2).forEach(System.out::println);

//        List<Integer> arrayList = Arrays.asList(1,2,3,4,56,78,89,54,21,8);
//
//        arrayList.stream().sorted().forEach(System.out::println);
//
//        System.out.println(arrayList.stream().sorted().collect(Collectors.toList()));

        int a1 = 10;

        System.out.println(getType(a1));

        List<Integer> lst = new ArrayList<>();
        Stack<Integer> stck = new Stack<>();

        System.out.println(getType(lst));
        System.out.println(getType(stck));

        System.out.println(getType(s));


    }
    public static String getType(Object o){

        return o.getClass().toString();

    }
}
