package Task4;

public class Circle implements Shape{
    public double radius = 0;
    public Circle(double i) {
        this.radius =i;

    }

    public double getArea(Double radius) {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
