package New;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item){
      items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;
        for (Item it:items){
            cost += it.price();
        }
        return cost;
    }
    public void showItem(){
        for (Item item:items){
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
