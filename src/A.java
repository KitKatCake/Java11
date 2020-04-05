import java.util.Scanner;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args){

//        System.out.println("Hello World!");
      //  System.out.printf(" Hello World!");

//        double b = 10.233;

//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i<10){
//            i++;
//         //   System.out.println(i);
//           // i++;
//            if(i<=5){
//                System.out.println(i);
//            }
//
//        }




//        int a,b;
//
//        a = 10;
//        b = 10;
//
//        System.out.println(a+b);

//        Stream.of(1,2,3,4,5,6).forEach(System.out::println);
//
//        System.out.println("-------------------------");

//        for(int i=1;i<=6;i++){
////            System.out.println(i);
//
//            if(i%2!=0){
//                System.out.println(i);
//            }
//        }

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("请从键盘上输入一个数字");
//
//        int a = input.nextInt();
//
//        System.out.println("你输入的数字是: "+a);

//       for(int i=1;i<=9;i++){
//           for(int j=1;j<=i;j++){
////               System.out.println("i"+i+"*"+"j"+j+"="+i*j);
//               System.out.print(j+"*"+i+"="+j*i+"\t");
//           }
//           System.out.println();
//       }
//
       Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();

       if(num>=20) {
           num--;
           System.out.println("num " + num);
       }else{
           num++;
           System.out.println("num "+ num);
       }



    }
}
