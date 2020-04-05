package Study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        Square s = (int x)->x*x;
        int ans = s.calculate(a);
        System.out.println(ans);

        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");

        Predicate<String> p = (s1)->s1.startsWith("G");

            for (String st:names){
                if (p.test(st)){
                    System.out.println(st);
                }
            }

    }
}
