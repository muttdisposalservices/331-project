public class Conways {
    private Grid grid;
    private int sideLength;
    
    public Conways(Grid grid) {
        this.grid = grid;
        this.sideLength = grid.getGridRow(0).length;
    }

    public Grid runSimulation() {
        int[][] currentStates = grid.getCurrentGrid();

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                int[][] neighborhood = grid.getNeighborhood(i, j);
                int[] flattenedNeighborhood = grid.flattenGrid(neighborhood);

                for (int k = 0; k < flattenedNeighborhood.length; k++) {
                    if (k % 3 == 0) {
                        System.out.print("[ ");
                    }
                    System.out.print(" " + flattenedNeighborhood[k] + " ");
                    if (k % 3 == 2) {
                        System.out.println("]");
                    }
                    if (k % 9 == 8) {
                        System.out.println();
                    }
                }
            }
        }
        return grid;
    }

    @Override
    public String toString() {
        int[][] currentStates = grid.getCurrentGrid();
        String returnString = "";

        for (int i = 0; i < sideLength; i++) {
            returnString += "[";
            for (int j = 0; j < sideLength; j++) {
                returnString += String.valueOf(currentStates[i][j]);
            }
            returnString += "]\n";
        }

        return returnString;
    }
}
