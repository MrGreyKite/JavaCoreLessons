package gb.homework5;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/main/resources/1.csv");
        AppData data = new AppData();
        data.read(file);

    }
}
