package ontwerppatronen.structural.bridge;

import ontwerppatronen.structural.bridge.colors.Green;
import ontwerppatronen.structural.bridge.colors.Purple;
import ontwerppatronen.structural.bridge.colors.Red;
import ontwerppatronen.structural.bridge.shapes.Circle;
import ontwerppatronen.structural.bridge.shapes.Square;
import ontwerppatronen.structural.bridge.shapes.Squircle;

/**
 * Intent: decouple an abstraction from its implementation so that the two can vary independently
 *
 * We can now have a single vehicle, that we can give a particular behavior which it will use
 * during it's complete lifecycle. Otherwise subclasses needed for each specific behavior: Car, Airplane, Bicycle etc
 * Compare with strategy: dynamic change of behavior at runtime possible, not intended in bridge pattern
 * Compare with factory method: no decoupling drive behavior from Vehicle, but has behavior
 *                              during it's complete lifecycle
 */
public class BridgeRunner {
    public static void main(String[] args) {
        // now no need to make seperate subclasses for red, green squares and red, green circles
        Shape redSquare = new Square(new Red());
        Shape greenSquare = new Square(new Green());
        Shape redCircle = new Circle(new Red());
        Shape greenCircle = new Circle(new Green());
        Shape purpleSquircle = new Squircle(new Purple());
        Shape purpleSquare = new Square(new Purple());

        redSquare.display();
        greenSquare.display();
        redCircle.display();
        greenCircle.display();
        purpleSquircle.display();
        purpleSquare.display();
    }
}
