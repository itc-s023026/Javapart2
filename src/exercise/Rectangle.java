package exercise;

public class Rectangle {
    private double vertica;
    private double horizontal;

    public Rectangle(double vertica, double horizontal) {
        this.vertica = vertica;
        this.horizontal = horizontal;
    }

    public double area() {
        return vertica * horizontal;
    }
}
