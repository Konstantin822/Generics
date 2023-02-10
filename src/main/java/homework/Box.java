package homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    private float totalWeight;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruitAdd) {
        fruits.add(fruitAdd);
    }

    public void addSomeFruits(T fruitAdd) {
        fruits.add(fruitAdd);
        fruits.add(fruitAdd);
    }

    public float getWeight() {
        if (fruits.size() != 0) {
            int i = 0;
            totalWeight = fruits.size() * fruits.get(i).weight();
        } else {
            System.out.println("The box is empty");
        }
        return totalWeight;
    }

    public boolean compare(Box<?> Box2) {
        return getWeight() == Box2.getWeight();
    }

    public void merge(Box<T> Box2) {
        Box2.fruits.addAll(fruits);
        fruits.clear();
    }
}
