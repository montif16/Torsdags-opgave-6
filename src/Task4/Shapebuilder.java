package Task4;

import java.util.ArrayList;

public class Shapebuilder {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void shapeBuilder (Shape shape){
        shapes.add(shape);
    }
    public double getTotalArea (ArrayList<Shape> manyShapes){
        double totalArea = 0.0;
        for (Shape shape : manyShapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
