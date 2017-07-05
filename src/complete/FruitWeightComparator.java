package complete;

import java.util.Comparator;

/**
 * Created by Admin on 2017.07.04..
 */
public class FruitWeightComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.getWeightInGramm() -  o2.getWeightInGramm();
    }
}
