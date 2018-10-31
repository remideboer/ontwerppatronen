package ontwerppatronen.structural.bridge.shapes;

import ontwerppatronen.structural.bridge.Colorable;
import ontwerppatronen.structural.bridge.Shape;

public class Square extends Shape {

    public Square(Colorable color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println(String.format("%s Rectangle", color.useColor()));
    }
}
