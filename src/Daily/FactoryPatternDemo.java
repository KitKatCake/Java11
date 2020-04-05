package Daily;

import org.w3c.dom.css.Rect;

public class FactoryPatternDemo {
    public static void main(String[] args) {
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape = shapeFactory.getShape("CIRCLE");
//        shape.draw();
//        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//        shape2.draw();
//        Shape shape3 = shapeFactory.getShape("SQUARE");
//        shape3.draw();

//        Rectangle rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
//        rectangle.draw();
//        Square square = (Square) ShapeFactory.getClass(Square.class);
//        square.draw();
//        Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
//        circle.draw();



        Rectangle rectangle = ShapeFactory.getClass(Rectangle.class);
        rectangle.draw();
        Square square = ShapeFactory.getClass(Square.class);
        square.draw();
        Circle circle = ShapeFactory.getClass(Circle.class);
        circle.draw();

        Factory.getShape("CIRCLE").draw();
        Factory.getShape("SQUARE").draw();
        Factory.getShape("RECTANGLE").draw();
    }
}
