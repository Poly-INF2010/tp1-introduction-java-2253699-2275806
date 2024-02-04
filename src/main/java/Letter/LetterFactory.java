package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        Rectangle firstBand = new Rectangle(maxWidth,maxHeight);
        Rectangle secondBand = firstBand.clone();
        secondBand.translate(secondBand.getCoords(),new Point2d(2.0,0.0));
        Rectangle thirdBand = new Rectangle(halfMaxWidth,halfMaxHeight);
        thirdBand.translate(thirdBand.getCoords(), new Point2d(2.0,1.0));
        thirdBand.rotate(thirdBand.getCoords(), 90.0);
        BaseShape a = new BaseShape();
        a.addAll(firstBand.getCoords());
        a.addAll(secondBand.getCoords());
        a.addAll(thirdBand.getCoords());
        return a;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        return null;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        return null;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        return null;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        return null;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        return null;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return null;
    }

}
