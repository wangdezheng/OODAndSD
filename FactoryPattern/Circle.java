package FactoryPattern;

public class Circle implements Shape {
    public Circle() {

    }
    @Override
    public void draw() {
        System.out.println("Miss Circle draw method");
    }
}
