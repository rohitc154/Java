package Inheritance.Polymorphism;

public class Circle extends Shapes {
    @Override
    void area() {
        System.out.println("Area from Circle i.e., PI * r  * r.");
    }
}
