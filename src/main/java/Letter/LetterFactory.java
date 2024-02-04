package Letter;

import Point.Point2d;
import Shape.*;

import java.nio.channels.Pipe;

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
        Rectangle firstBand = new Rectangle(15.0,maxHeight);
        Rectangle secondBand = new Rectangle(15.0,maxHeight);
        Rectangle thirband = new Rectangle(15.0, 75.0);
        BaseShape letterA = new BaseShape();

        firstBand.rotate(firstBand.getCoords(), Math.PI/9);

        secondBand.rotate(secondBand.getCoords(), -Math.PI/9);
        secondBand.translate(secondBand.getCoords(), new Point2d(new Double[]{60.0,0.0}));

        thirband.rotate(thirband.getCoords(),Math.PI/2);
        thirband.translate(thirband.getCoords(),new Point2d(new Double[]{20.0,20.0}));

        letterA.addAll(secondBand.getCoords());
        letterA.addAll(firstBand.getCoords());
        letterA.addAll(thirband.getCoords());

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle firstBand = new Rectangle(20.0,maxHeight);
        Circle firstCircle = new Circle(40.0);
        Circle secondCircle = new Circle(40.0);
        BaseShape letterB = new BaseShape();

        firstCircle.remove(new Circle(35.0));
        firstCircle.translate(firstCircle.getCoords(), new Point2d(new Double[]{28.0,40.0}));

        secondCircle.remove(new Circle(35.0));
        secondCircle.translate(secondCircle.getCoords(), new Point2d(new Double[] {28.0, -40.0}));

        letterB.add(firstBand);
        letterB.add(firstCircle);
        letterB.add(secondCircle);

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse = new Ellipse(100.0, maxHeight);
        Square bandToRemove = new Square(80.0);
        BaseShape letterC = new BaseShape();

        ellipse.remove(new Ellipse(85.0,maxHeight-25));
        ellipse.translate(ellipse.getCoords(), new Point2d(new Double[] {0.0,-60.0}));

        bandToRemove.translate(bandToRemove.getCoords(), new Point2d(new Double[] {ellipse.getMaxX()-15.0, ellipse.getMinY()/2}));
        for(Point2d coord:bandToRemove.getCoords()){
            ellipse.remove(coord);
        }

        letterC.addAll(ellipse.getCoords());
        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle firstBand = new Rectangle(15.0,maxHeight);
        Rectangle secondBand = new Rectangle(15.0,halfMaxHeight);
        Rectangle thirdBand = new Rectangle(15.0,halfMaxHeight);
        Rectangle fourthBand = new Rectangle(15.0,halfMaxHeight);
        BaseShape letterE = new BaseShape();

        secondBand.rotate(secondBand.getCoords(), Math.PI/2);
        secondBand.translate(secondBand.getCoords(), new Point2d(new Double[]{28.0,-68.0}));

        thirdBand.rotate(thirdBand.getCoords(), Math.PI/2);
        thirdBand.translate(thirdBand.getCoords(), new Point2d(new Double[]{28.0,68.0}));

        fourthBand.rotate(fourthBand.getCoords(), Math.PI/2);
        fourthBand.translate(fourthBand.getCoords(), new Point2d(new Double[]{28.0,0.0}));

        letterE.addAll(firstBand.getCoords());
        letterE.addAll(secondBand.getCoords());
        letterE.addAll(thirdBand.getCoords());
        letterE.addAll(fourthBand.getCoords());

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle firstBand = new Rectangle(15.0,maxHeight);
        Rectangle secondBand = new Rectangle(15.0,maxHeight);
        Rectangle thirdBand = new Rectangle(15.0,halfMaxHeight);
        BaseShape letterH = new BaseShape();

        secondBand.translate(secondBand.getCoords(),new Point2d(new Double[] {60.0,0.0}));

        thirdBand.rotate(thirdBand.getCoords(), Math.PI/2);
        thirdBand.translate(thirdBand.getCoords(), new Point2d(new Double[] {30.0,0.0}));

        letterH.addAll(firstBand.getCoords());
        letterH.addAll(secondBand.getCoords());
        letterH.addAll(thirdBand.getCoords());

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle firstBand = new Rectangle(15.0,maxHeight);
        Rectangle secondBand = new Rectangle(15.0, maxHeight);
        Rectangle thirdBand = new Rectangle(15.0,maxHeight);
        BaseShape letterN = new BaseShape();

        secondBand.translate(secondBand.getCoords(), new Point2d(new Double[] {65.0,0.0}));

        thirdBand.rotate(thirdBand.getCoords(),-35.0);
        thirdBand.translate(thirdBand.getCoords(), new Point2d(new Double[]{35.0,0.0}));

        letterN.addAll(firstBand.getCoords());
        letterN.addAll(secondBand.getCoords());
        letterN.addAll(thirdBand.getCoords());

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipse = new Ellipse(80.0,maxHeight);
        BaseShape letterO = new BaseShape();

        ellipse.removeAll(new Ellipse(65.0,125.0).getCoords());

        letterO.add(ellipse);

        return letterO;
    }

}
