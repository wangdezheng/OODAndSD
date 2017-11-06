package FactoryPattern;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(ShapeType type) {
        if (type == null) {
            return null;
        }
        if (type == ShapeType.Circle) {
            return new Circle();
        }
        if (type == ShapeType.Rectangle) {
            return new Rectangle();
        }
        if (type == ShapeType.Square) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(ColorType colortype) {
        return null;
    }
}
