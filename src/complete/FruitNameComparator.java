package complete;

import java.util.Comparator;

/**
 * Created by Admin on 2017.07.05..
 */
public class FruitNameComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
