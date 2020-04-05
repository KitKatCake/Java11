package Boring;

public class C {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Flip");
            if (i%5 == 0)
                System.out.println("Flot");
            } else if (i % 15 == 0) {
                System.out.println("FlipFlot");
            } else {
                System.out.println(i);
            }
        }


        /*
        int men;
        for (men = 0; men <=10 ; men++) {
            int women = 20 - 2*men;
            int kids = 30 - women - men ;
            if( 3 * men + 2 * women + kids == 50 ){
                System.out.println("men = "+men+" kids = "+kids+" women  = "+women);
            }
        }


         */

        /*int sum = 0,i;
        for (i = 1; i < 4; i++) {
            switch (i){
                case 1:
                    sum += 2;
                case 2:
                    sum += 6;
                case 3:
                    sum += 16;
                    break;
            }
        }
         */
    }
}
