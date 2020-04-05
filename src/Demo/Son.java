package Demo;

public class Son extends Person {
 /*   @Override
    public void eat() {
        System.out.println("Son eatting ....");
    }
*/
    public void fly() {
        System.out.println("Son fly ...");
    }

  /*  @Override
    public void sleep() {
        System.out.println("Son sleeping ...");
    }
*/
    public static void main(String[] args) {
        /*Person person = new Son();
        person.eat();
        person.sleep();

        Son son = (Son)person;

        son.fly();

         */

        Person p = new Son();
        Son s = (Son)p;

        s.eat();
        s.sleep();
        s.fly();
    }
}
