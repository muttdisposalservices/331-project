
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

    public void setCell(int row, int col, int value) {
        this.cells[row][col] = value;
    }

    public int[][] getNeighborhood(int row, int col) {
        int[][] neighborhood = new int[this.sideLength][this.sideLength];
        
        for (int i = 0; i < this.sideLength; i++) {
            for (int j = 0; j < this.sideLength; j++) {
                int wrappedRow = Math.floorMod(row - 1 + i, this.sideLength);
                int wrappedCol = Math.floorMod(col - 1 + j, this.sideLength);

                neighborhood[i][j] = this.cells[wrappedRow][wrappedCol];
            }
        }
        return neighborhood;
    }
}
