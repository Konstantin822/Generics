package homework;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        toList(new Integer[] {1, 2, 3});

        Box<Apple> appleBox = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apples = new Apple();

        Box<Orange> orangeBox = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange oranges = new Orange();

        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addSomeFruits(apples);

        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addSomeFruits(oranges);

        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());

        System.out.println("Compare: " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.merge(newAppleBox);
        System.out.println("New apple box weight: " + newAppleBox.getWeight());
    }
    public static void toList(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);
    }
}
