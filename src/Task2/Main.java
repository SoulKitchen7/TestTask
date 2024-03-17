package Task2;

import java.util.List;

import static Task2.CircleDraw.drawCircle;

public class Main {
    public static void main(String[] args) {
        int centerX_mm = 0;
        int centerY_mm = 0;
        int diameter_mm = 25;
        int resolution_dpi = 300;

        List<int[]> circlePoints = drawCircle(centerX_mm, centerY_mm, diameter_mm, resolution_dpi);

        for (int[] point : circlePoints) {
            System.out.println( + point[0] + ", " + point[1]);
        }
    }
}

