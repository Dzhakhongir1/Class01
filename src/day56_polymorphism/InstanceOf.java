package day56_polymorphism;

import day57_abstract_polymorhism.abstract_class_vs_interface.shapes.Circle;
import day57_abstract_polymorhism.abstract_class_vs_interface.shapes.Shape;
import day57_abstract_polymorhism.abstract_class_vs_interface.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if (shape instanceof Circle){
            System.out.println("its a circle object");
        }else if (shape instanceof Square){
            System.out.println("its a Square object");
        }
        System.out.println(shape.getClass().getSimpleName());

        WebElement el = new Link();
        System.out.println(el.getClass().getSimpleName());

    }



}
