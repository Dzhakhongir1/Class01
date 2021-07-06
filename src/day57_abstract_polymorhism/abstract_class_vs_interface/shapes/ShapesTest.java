package day57_abstract_polymorhism.abstract_class_vs_interface.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        List<Shape>listOfShapes = new ArrayList<>();
        listOfShapes.add(new Triangle());
        listOfShapes.add(new Square());
        listOfShapes.add(new Circle());
        drawShape(new Circle());

        for (Shape eachShape: listOfShapes){
           eachShape.draw();
       }
        for (int i =0; i<listOfShapes.size(); i++){

        }
    }
    public static void drawShape(Circle shape){
        System.out.println("Drowing shape");
        shape.draw();
    }
}
