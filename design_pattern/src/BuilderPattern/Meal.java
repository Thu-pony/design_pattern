package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
private List<item> lists = new ArrayList<>();

public void additem(item e) {
	lists.add(e);
}

public float getCost() {
	float cost = 0.0f;
	for (item e: lists)cost += e.price();
	return cost;
}
public void showItems(){
    for (item item : lists) {
       System.out.print("Item : "+item.name());
       System.out.print(", Packing : "+item.pack().pack());
       System.out.println(", Price : "+item.price());
    }        
 } 
}
