package FactoryPattern;

public class Rectangle implements Shape {
    public Rectangle() {

    }
    @Override
    public void draw() {
        System.out.println("Miss Rectangle draw method");
    }
}
