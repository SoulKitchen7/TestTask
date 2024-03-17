package Task3;

import static Task3.PathFinder.findAndMarkPath;
import static Task3.PathFinder.printGrid;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 0, 0, 1},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 0, 0, 0, 1}
        };

        int[] pointA = {1, 1}; // Координаты точки A
        int[] pointB = {3, 3}; // Координаты точки B

        findAndMarkPath(grid, pointA, pointB);
        printGrid(grid);
    }
}
