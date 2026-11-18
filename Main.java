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
        int[][] gridArray = grid.getCurrentGrid();
        for (int i = 0; i < gridArray.length; i++) {
            System.out.printf("[ ");
            for (int j = 0; j < gridArray[i].length; j++) {
                System.out.printf("%d ", gridArray[i][j]);
            }
            System.out.printf("]\n");
        }

        //Test marker
        System.out.println("Neighborhood centered at [1, 2]:");

        int[][] testneighborhood = grid.getNeighborhood(1, 2);
        for (int i = 0; i < testneighborhood.length; i++) {
            System.out.printf("[ ");
            for (int j = 0; j < testneighborhood[i].length; j++) {
                System.out.printf("%d ", testneighborhood[i][j]);
            }
            System.out.printf("]\n");
        }
    }

    public static Grid zeroGrid(Grid grid) {
        for (int i = 0; i < grid.getCurrentGrid().length; i++) {
            Arrays.fill(grid.getGridRow(i), 0);
        }
        return grid;
    }
}
