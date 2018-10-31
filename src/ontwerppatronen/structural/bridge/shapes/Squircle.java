package ontwerppatronen.structural.bridge.shapes;

import ontwerppatronen.structural.bridge.Colorable;
import ontwerppatronen.structural.bridge.Shape;

public class Squircle extends Shape {

    public Squircle(Colorable color) {
        super(color);
    }

    @Override
    public void display() {
        System.out.println(String.format("%s Squircle", color.useColor()));
    }
}