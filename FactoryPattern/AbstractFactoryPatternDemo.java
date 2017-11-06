package FactoryPattern;

/**
 * Why we use factory pattern:
 * 1: Separate instance or object creation from its usage
 * 2: More clean especially when we have complicated instance creation logic;
 * 3: Easier to extend the instance creation login (extend the factory only)
 * 4: Provide chances to have different object allocation strategies (code reuse)
 *
 * Abstract Factory pattern:
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 */

public class AbstractFactoryPatternDemo {
    public static void main(String [] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.Shape);

        //get an object of Shape Circle
        Shape circle = shapeFactory.getShape(ShapeType.Circle);

        //call draw method of Shape Circle
        circle.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.Color);

        //get an object of Color Red
        Color red = colorFactory.getColor(ColorType.Red);

        //call fill method of Red
        red.fill();
    }
}
