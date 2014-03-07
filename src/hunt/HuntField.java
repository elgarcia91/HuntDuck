package hunt;

public class HuntField {

    private char[][] hunt;
    private int rows;
    private int columns;

    public HuntField(int X, int Y) {
        rows = X;
        columns = Y;
        hunt = new char[X][Y];
    }

    public int getXLength() {
        return rows;
    }

    public int getYLength() {
        return columns;
    }

    public boolean setItem(FieldItem I, Position pos) {
    }

    public boolean shot(Position pos) {
    }

    public boolean removeItem(FieldItem I, Position pos) {
    }

    public char getItemType(Position pos) {
    }

    public boolean moveItem(FieldItem I, Position from, Position to) {
    }

    public int getNumberOfItems(char item) {
    }

    @Override
    public String toString() {
    }
}