package Daily;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();

    }
}
