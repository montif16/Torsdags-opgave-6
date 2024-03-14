package Task4;

public class Square implements Shape{

    public double getArea(double length) {
        return length*length;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
