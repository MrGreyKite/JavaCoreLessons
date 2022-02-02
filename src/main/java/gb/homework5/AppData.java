package gb.homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {
    private List<String> headers = new ArrayList<>();
    private List<List<Integer>> records = new ArrayList<>();

    public void read(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int rows;

            String delimiter = ";";
            String[] headersArray = reader.readLine().split(delimiter);
            rows = headersArray.length;
            for (String header : headersArray) {
                headers.add(header);
            }

            while ((line = reader.readLine()) != null){
                String[] linesArray = line.split(delimiter);
                Integer[] numArray = new Integer[rows];
                for (int i = 0; i < rows; i++) {
                    numArray[i] = Integer.parseInt(linesArray[i]);
                }
                records.add(Arrays.asList(numArray));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(headers);
        System.out.println(records);

    }
}
