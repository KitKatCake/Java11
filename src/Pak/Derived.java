package Pak;

public class Derived extends Base {
    int y;
    Derived(){
        System.out.println("Derived Class Constructor Called ");
    }
    Derived(int _x,int _y){
        super(_x);
        y = _y;
    }
    void Display(){
        System.out.println("x = "+x+", y = "+y);
    }
}
