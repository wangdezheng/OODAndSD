package FactoryPattern;

public class Square implements Shape {
    public Square() {

    }
    @Override
    public void draw() {
        System.out.println("Miss Square draw method");
    }
}
