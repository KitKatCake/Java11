package New;

public class Plate<T>  {
    private T item;
    public Plate(T t){
        this.item = item;

    }
    public T get(){
        return item;
    }
    public void set(T item){
        this.item = item;
    }

    public static void main(String[] args) {
        Plate<? extends Fruit> p = new Plate<Apple>(new Apple());






    }
}
