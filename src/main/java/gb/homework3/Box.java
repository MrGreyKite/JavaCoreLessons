package gb.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitList;
    private String fruitName;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    @SafeVarargs
    public Box(T... fruits) {
        this.fruitList = Arrays.asList(fruits);
        this.fruitName = fruits[0].toString();
    }

    public void addFruit(T fruit){
        if (fruitList.isEmpty())
            fruitName = fruit.toString();
        fruitList.add(fruit);
    }

    public void addFruits(T fruit, int amount) {
        if (fruitList.isEmpty())
            fruitName = fruit.toString();
        for (int i = 0; i < amount; i++) {
            fruitList.add(fruit);
        }
    }

    public float getWeight() {
        float sumWeightFruits = 0.0f;
            for (Fruit f : fruitList) {
                sumWeightFruits += f.getWeight();
            }
        return sumWeightFruits;
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void pourOverTo(Box<T> destinationBox){
        for (T fruit : fruitList){
            destinationBox.addFruit(fruit);
        }
        fruitList.clear();
    }

    void info() {
        if (fruitList.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся фрукты типа " + fruitName + " в количестве: " + fruitList.size());
        }
    }

}
