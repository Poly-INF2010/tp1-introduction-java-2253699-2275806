package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     *
     * @param width  Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super();
        double halfWidth = width / 2.0;
        double halfHeight = height / 2.0;
        int nbPointsX = (int) (width / 0.5);
        int nbPointsY = (int) (height / 0.5);
        for (int i = 0; i < nbPointsX; i++) {
            for (int j = 0; j < nbPointsY; j++) {
                double x = -halfWidth + i * 0.5;
                double y = -halfHeight + j * 0.5;
                add(new Point2d(x, y));
            }
        }
    }

    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     *
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * TODO
     * Create a rectangle from a given collection of Points
     *
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /**
     * TODO
     *
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
