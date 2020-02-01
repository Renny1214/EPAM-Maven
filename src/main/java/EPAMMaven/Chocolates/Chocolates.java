package EPAMMaven.Chocolates;

import java.util.Comparator;

public class Chocolates implements Comparable<Chocolates> {
    private String name;
    private int price;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Chocolates(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chocolates{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Chocolates o) {
        if(o.price>price)
        {
            return 1;
        }
        if(o.price<price)
        {
            return -1;
        }
        return 0;
    }
}
