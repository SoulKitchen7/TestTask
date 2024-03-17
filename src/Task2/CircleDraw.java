package Task2;

import java.util.ArrayList;
import java.util.List;

public class CircleDraw {
    private static final double MM_TO_INCH = 0.03937007874;

    public static List<int[]> drawCircle(int centerX_mm,
                                         int centerY_mm,
                                         int diameter_mm,
                                         int resolution_dpi) {
        List<int[]> points = new ArrayList<>();

        double radius_mm = diameter_mm / 2.0;
        double radius_inch = radius_mm * MM_TO_INCH;
        double radius_pixels = radius_inch * resolution_dpi;

        double stepSize = 1.0 / resolution_dpi;

        for (double theta = 0; theta <= 2 * Math.PI; theta += stepSize) {
            int x = (int) Math.round(centerX_mm + radius_pixels * Math.cos(theta));
            int y = (int) Math.round(centerY_mm + radius_pixels * Math.sin(theta));
            points.add(new int[]{x, y});
        }

        return points;
    }
}
