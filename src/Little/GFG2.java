package Little;

public class GFG2 {
    {
        System.out.println("IIB1 block");
    }
    {
        System.out.println("IIB2 block");
    }
    GFG2(){
        System.out.println("Constructor Called");
    }
    {
        System.out.println("IIB3 block");
    }

    public static void main(String[] args) {
        GFG2 a = new GFG2();

    }
}
