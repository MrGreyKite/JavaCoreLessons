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

        orangeBox3.addFruit(new Orange());
        appleBox3.addFruits(new Apple(),5);

        appleBox3.info();
        orangeBox3.info();

        System.out.println("Коробка 1 соответствует по весу коробке 2: "+orangeBox1.compare(appleBox1));
        System.out.println("Коробка 1 соответствует по весу коробке 4: "+orangeBox2.compare(appleBox2));


    }

    public static  <T> T[] swapTwoArrayElements(T[] array, int elem1, int elem2){
        T tempValue = array[elem1];
        array[elem1] = array[elem2];
        array[elem2] = tempValue;
        return array;
    }
}
