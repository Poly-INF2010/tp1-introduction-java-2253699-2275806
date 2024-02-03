package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /**
     * TODO
     * Create a filled Ellipse that is centered on (0, 0)
     *
     * @param widthDiameter  Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();

        double halfWidth = widthDiameter / 2;
        double halfHeight = heightDiameter / 2;
        double pointDensity = 0.5;
        int pointCounterX = (int) (widthDiameter / pointDensity);
        int pointCounterY = (int) (heightDiameter / pointDensity);

        for (int i = 0; i < pointCounterX; i++) {
            for (int j = 0; j < pointCounterY; j++) {
                double x = -halfWidth + i * pointDensity;
                double y = -halfHeight + j * pointDensity;
                boolean isInEllipse = (x * x) / (halfWidth * halfWidth) + (y * y) / (halfHeight * halfHeight) <= 1;
                if (isInEllipse) {
                    add(new Point2d(x, y));
                }
            }
        }

    }

    /**
     * TODO
     * Create a filled Ellipse that is centered on (0,0)
     *
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     *
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /**
     * TODO
     *
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
