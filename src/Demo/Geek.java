package Demo;

public class Geek {
    int num;
    String name;
    Geek(){
        System.out.println("Constructor  called");
    }

    Geek(String name,int num){
        this.name = name;
        this.num = num;
    }

    public static void main(String[] args) {
        /*Geek geek = new Geek();
        System.out.println(geek.name);
        System.out.println(geek.num);*/

    Geek geek1 = new Geek("adam",1);
        System.out.println("GeekName :" + geek1.name +
                " and GeekId :" + geek1.num);

    }

}