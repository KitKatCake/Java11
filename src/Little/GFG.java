package Little;

public class GFG {
    {
        System.out.println("Common part of constructors invoked !!");
    }
    public GFG(){
        System.out.println("Default Constructor invoked");
    }
    public GFG(int x){
        System.out.println("Parametrized constructor invoked");
    }

    public static void main(String[] args) {
        GFG obj1,obj2;
        obj1 = new GFG();
        obj2 = new GFG(0);
    }
}
