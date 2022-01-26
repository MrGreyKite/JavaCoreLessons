package gb.homework3;

public class Apple extends Fruit {
    private final float weight;

    public Apple(){
        this.weight = 1.0f;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "яблоко";
    }
}
