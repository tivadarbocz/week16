package complete;

/**
 * Created by Admin on 2017.07.05..
 */
public class Fruit /*implements Comparable<FruitO>*/{
    private String name;
    private int weightInGramm;

    public Fruit() {
    }

    public Fruit(String name, int weightInGramm) {
        this.name = name;
        this.weightInGramm = weightInGramm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInGramm() {
        return weightInGramm;
    }

    public void setWeightInGramm(int weightInGramm) {
        this.weightInGramm = weightInGramm;
    }

    @Override
    public String toString() {
        return "FruitO{" +
                "name='" + name + '\'' +
                ", weightInGramm=" + weightInGramm +
                '}';
    }

    /*@Override
    public int compareTo(FruitO o) {
        return this.getName().compareTo(o.getName());
    }*/
}
