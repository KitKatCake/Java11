package Daily;

public class ShapeFactory2 extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape==null){
            return null;
        }else if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
