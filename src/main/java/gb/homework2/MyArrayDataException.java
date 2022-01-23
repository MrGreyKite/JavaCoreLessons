package gb.homework2;

public class MyArrayDataException extends Exception {
    private int row;

    private int column;

    public String getCell() {
        return "Ячейка: [" + row + "][" + column + "]";
    }

    public MyArrayDataException(String message, int row, int column){
        super(message);
        this.row = row;
        this.column = column;
    }
}
