package ontwerppatronen.structural.bridge;

public abstract class Shape {
    protected Colorable color; // In Java protected always a little questionable since package private

    public Shape(Colorable color) {
        this.color = color;
    }

    public abstract void display();
}
