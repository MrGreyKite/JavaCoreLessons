package gb.homework2;

import org.apache.commons.lang.math.NumberUtils;

public class Main {
    public static void main(String[] args) {
        String[][] arrForTest1 = new String[4][4];

        arrForTest1[0][0] = "1";
        arrForTest1[0][1] = "11";
        arrForTest1[0][2] = "2";
        arrForTest1[0][3] = "12";

        arrForTest1[1][0] = "2";
        arrForTest1[1][1] = "12";
        arrForTest1[1][2] = "7";
        arrForTest1[1][3] = "22";

        arrForTest1[2][0] = "3";
        arrForTest1[2][1] = "13";
        arrForTest1[2][2] = "4";
        arrForTest1[2][3] = "13";

        arrForTest1[3][0] = "4";
        arrForTest1[3][1] = "14";
        arrForTest1[3][2] = "1";
        arrForTest1[3][3] = "1";

        String[][] arrForTest2 = new String[4][4];
        arrForTest2[0][0] = "1";
        arrForTest2[0][1] = "М";
        arrForTest2[0][2] = "";
        arrForTest2[0][3] = "12";
        arrForTest2[1][0] = "2";
        arrForTest2[1][1] = "12";
        arrForTest2[1][2] = "7";
        arrForTest2[1][3] = "22";
        arrForTest2[2][0] = "***";
        arrForTest2[2][1] = "13";
        arrForTest2[2][2] = "4";
        arrForTest2[2][3] = "13";
        arrForTest2[3][0] = "4";
        arrForTest2[3][1] = "14";
        arrForTest2[3][2] = "1";
        arrForTest2[3][3] = "1";

        String[][] arrForTest3 = new String[3][4];
        arrForTest2[0][0] = "1";
        arrForTest2[0][1] = "М";
        arrForTest2[0][2] = "";
        arrForTest2[0][3] = "12";
        arrForTest2[1][0] = "2";
        arrForTest2[1][1] = "12";
        arrForTest2[1][2] = "7";
        arrForTest2[1][3] = "22";
        arrForTest2[2][0] = "***";

        try{
            int result = summOf2DArray(arrForTest2);
            System.out.println(result);
        }
        catch(MyArrayDataException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            System.out.println(ex.getCell());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static int summOf2DArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != arr[0].length && arr.length != 4) {
            throw new MyArraySizeException("Неправильный размер массива - должен быть 4х4");
        } else
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (NumberUtils.isNumber((arr[i][j]))) {
                        int elem = Integer.parseInt(arr[i][j]);
                        sum += elem;
                    } else throw new MyArrayDataException("Неверные данные в ячейке", i, j);

                }
            }
        return sum;
    }
}
