package FactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (factoryType == FactoryType.Shape) {
            return new ShapeFactory();
        }
        if (factoryType == FactoryType.Color) {
            return new ColorFactory();
        }
        return null;
    }
}
