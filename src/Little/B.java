package Little;

import java.util.Arrays;
import java.util.Collections;

public class B extends A {
    B(){
        super();
        System.out.println("B-Constructor Called");
    }
    {
        System.out.println("B-IIB block");
    }

    public static void main(String[] args) {
       // B b = new B();

        //int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

//        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));

        /*for (var p:arr){
            System.out.println(p);
        }

         */
        System.out.println();

        int[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr1, 1, 5);

        System.out.printf("Modified arr1[] : %s",
                Arrays.toString(arr1));



    }
}
