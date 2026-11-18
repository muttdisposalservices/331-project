public class Grid {
    private int sideLength;
    private int[][] cells;

    public Grid(int sideLength) {
        this.sideLength = sideLength;
        cells = new int[sideLength][sideLength];
    }

    public int[][] getCurrentGrid() {
        return this.cells;
    }

    public int[] getGridRow(int row) {
        return this.cells[row];
    }
}
