package FactoryPattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapetype) {
        return null;
    }

    @Override
    public Color getColor(ColorType colortype) {
        if (colortype == null) {
            return null;
        }
        if (colortype == ColorType.Blue) {
            return new Blue();
        }
        if (colortype == ColorType.Red) {
            return new Red();
        }
        if (colortype == ColorType.Green) {
            return new Green();
        }
        return null;
    }
}
