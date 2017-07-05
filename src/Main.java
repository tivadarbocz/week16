import complete.Fruit;
import complete.FruitNameComparator;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        Fruit melone = new Fruit("Melone", 700);
        Fruit apple = new Fruit("Apple", 100);
        Fruit banana = new Fruit("Banana", 220);

        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(melone);
        fruitList.add(apple);
        fruitList.add(banana);

        //Collections.sort(fruitList, new FruitWeightComparator());
        Collections.sort(fruitList, new FruitNameComparator());

        for(Fruit f : fruitList){
            System.out.println(f.toString());
        }

    }
}
