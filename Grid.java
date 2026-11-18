
public class Grid {
    private int sideLength;
    private int[][] cells;

    public Grid(int sideLength) {
        this.sideLength = sideLength;
        cells = new int[sideLength][sideLength];
    }

    public int getSideLength() {
        return this.sideLength;
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
                int wrappedRow = Math.floorMod(row + i, this.sideLength);
                int wrappedCol = Math.floorMod(col + j, this.sideLength);

                neighborhood[i][j] = this.cells[wrappedRow][wrappedCol];
            }
        }
        return neighborhood;
    }

    // Grid input
    public int[] flattenGrid(Grid gridObject) {
        int gridLength = gridObject.getSideLength();
        int[][] gridState = gridObject.getCurrentGrid();

        int[] returnGrid = new int[gridLength];

        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridLength; j++) {
                returnGrid[i + j] = gridState[i][j];
            }
        }

        return returnGrid;
    }


    // Array input
    public int[] flattenGrid(int[][] gridArray) {
        int gridLength = gridArray.length;

        int[] returnGrid = new int[gridLength * gridLength];

        int count = 0;
        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridLength; j++) {
                returnGrid[count] = gridArray[i][j];
                count++;
            }
        }

        return returnGrid;
    }

    @Override
    public String toString() {
        int[][] currentStates = this.cells;
        String returnString = "";

        for (int i = 0; i < sideLength; i++) {
            returnString += "[ ";
            for (int j = 0; j < sideLength; j++) {
                returnString += " " + String.valueOf(currentStates[i][j]) + " ";
            }
            returnString += " ]\n";
        }

        return returnString;
    }
}
