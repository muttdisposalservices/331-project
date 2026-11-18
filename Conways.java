public class Conways {
    private Grid grid;
    private int sideLength;
    
    public Conways(Grid grid) {
        this.grid = grid;
        this.sideLength = grid[0].length;

        runSimulation(this.grid);
    }

    public void runSimulation(Grid grid) {
        int[][] currentStates = grid.getCurrentGrid();

        for (int i = 0; i < currentStates.length; i++) {

        }
    }
}
