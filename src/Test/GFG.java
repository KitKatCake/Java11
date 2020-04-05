package Test;

import java.util.Arrays;
import java.util.List;

public class GFG {
    /*public static Pair<Integer,String> getTwo(){
        return new Pair<Integer,String>(10,"GeeksforGeeks");
    }*/
    public static List<Object> getDetails(){

        String name = "Geek";
        int age = 35;
        char gender = 'M';
        return Arrays.asList(name,age,gender);
    }
    public static void main(String[] args) {
        List<Object> person = getDetails();
        System.out.println(person);
    }
}
