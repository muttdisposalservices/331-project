import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sideLength = Integer.parseInt(args[0]);
        long seed = Long.parseLong(args[1]);

        Grid grid = new Grid(sideLength);
        if (seed == 0) {
            grid = zeroGrid(grid);
        }

        grid.setCell(1, 2, 10);
        System.out.println("Starting grid:");
        System.out.println(grid.toString());

        Conways sim = new Conways(grid);
        sim.runSimulation();
    }

    public static Grid zeroGrid(Grid grid) {
        for (int i = 0; i < grid.getCurrentGrid().length; i++) {
            Arrays.fill(grid.getGridRow(i), 0);
        }
        return grid;
    }
}
