package Task3;

import java.util.ArrayDeque;
import java.util.Queue;

public class PathFinder {

    // Метод для поиска пути от точки A к точке B и промаркирования пути числом 2
    public static void findAndMarkPath(int[][] grid, int[] pointA, int[] pointB) {
        int rows = grid.length; //количество строк в массиве
        int cols = grid[0].length; //количество столбцов в массиве

        // Создаем очередь для поиска в ширину
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(pointA);

        // Пока очередь не пуста, ищем путь от A к B
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            // Если текущая точка равна B, значит, путь найден
            if (row == pointB[0] && col == pointB[1]) {
                break;
            }

            // Перебираем соседей текущей точки
            for (int[] dir : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Проверяем, что новые координаты находятся в пределах массива и точка не занята
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 0) {
                    grid[newRow][newCol] = 2; // Маркируем точку как принадлежащую пути
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }

    // Метод для вывода массива в консоль
    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

