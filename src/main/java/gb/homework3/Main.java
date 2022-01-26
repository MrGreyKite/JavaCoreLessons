package gb.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] arr2 = {"A", "B", "C"} ;
        System.out.println(Arrays.toString(swapTwoArrayElements(arr1,0,9)));
        System.out.println(Arrays.toString(swapTwoArrayElements(arr2,0,2)));

        Box<Orange> orangeBox1 = new Box<>(new Orange(),new Orange(),new Orange(),new Orange());
        Box<Apple> appleBox1 = new Box<>(new Apple(),new Apple(),new Apple(),new Apple());

        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        Box<Orange> orangeBox3 = new Box<>();
        Box<Apple> appleBox3 = new Box<>();

        appleBox1.info();
        orangeBox1.info();

        appleBox2.info();
        orangeBox2.info();

        System.out.println("Коробка с апельсинами #1 соответствует по весу коробке с яблоками #1: "+orangeBox1.compare(appleBox1));
        System.out.println("Коробка с апельсинами #2 соответствует по весу коробке с яблоками #2: "+orangeBox2.compare(appleBox2));

        orangeBox3.addFruit(new Orange());
        orangeBox3.addFruit(new Orange());
        appleBox3.addFruits(new Apple(),9);

        appleBox3.info();
        orangeBox3.info();

        orangeBox1.pourOverTo(orangeBox3);

        System.out.println("Вес коробки с апельсинами #1:" + orangeBox1.getWeight());
        System.out.println("Вес коробки с апельсинами #3:" + orangeBox3.getWeight());
        System.out.println("Вес коробки с яблоками #3:" + appleBox3.getWeight());

        System.out.println("Коробка с апельсинами #1 соответствует по весу коробке с апельсинами #2: "+orangeBox1.compare(orangeBox2));
        System.out.println("Коробка с апельсинами #3 соответствует по весу коробке с яблоками #3: "+orangeBox3.compare(appleBox3));



    }

    public static  <T> T[] swapTwoArrayElements(T[] array, int elem1, int elem2){
        T tempValue = array[elem1];
        array[elem1] = array[elem2];
        array[elem2] = tempValue;
        return array;
    }
}
