package Demo;

public class Box2 {
    double width,height,depth;
    int boxNo;
    Box2(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    Box2(){
        width = height = depth = 0;
    }
    Box2(int num){
       // this();
        boxNo = num;
    }

    public static void main(String[] args) {
        Box2 box2 = new Box2(2);
        System.out.println(box2.width);
    }
}
