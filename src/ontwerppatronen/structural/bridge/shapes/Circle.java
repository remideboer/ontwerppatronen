package ontwerppatronen.structural.bridge.shapes;

import ontwerppatronen.structural.bridge.Colorable;
import ontwerppatronen.structural.bridge.Shape;

public class Circle extends Shape {

    public Circle(Colorable color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println(String.format("%s Circle", color.useColor()));
    }
}