package Little;

public class CloneExample implements Cloneable{
    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        CloneExample obj = new CloneExample();
        try {
            CloneExample obj2 = (CloneExample)obj.clone();
            System.out.println(obj.name);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
