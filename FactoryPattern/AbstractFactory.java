package FactoryPattern;

public abstract class AbstractFactory {
    abstract Color getColor(ColorType colortype);
    abstract Shape getShape(ShapeType shapetype);
}
