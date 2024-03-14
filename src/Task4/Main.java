package Task4;

public class Main {
    public static void main(String[] args) {

       //System.out.println(Circle.getArea(2.0));
       // System.out.println(Square.getArea(2.0));
        Circle circle1 = new Circle(3);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getArea(2.0));
    }
}
