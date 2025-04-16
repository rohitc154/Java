package Abstraction;

public class ShapeMain {
    public static void main(String[] args) {
        Cube obj = new Cube(5);
        Cylinder obj2 = new Cylinder(5, 6);
        Cuboid obj3 = new Cuboid(2, 3, 2);

        double vol = obj.volume();
        System.out.println(vol);
        vol = obj.surfaceArea();
        System.out.println(vol);

        vol = obj2.volume();
        System.out.println(vol);
        vol = obj2.surfaceArea();
        System.out.println(vol);

        vol = obj3.volume();
        System.out.println(vol);
        vol = obj3.surfaceArea();
        System.out.println(vol);
    }
}

abstract class Shape {
    double length, breadth, height;

    Shape(double l) {
        this.length = l;
    }

    Shape(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    Shape(double l, double b, double h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    abstract double volume();

    abstract double surfaceArea();
}

// ----Cube Class
class Cube extends Shape {
    Cube(double len) {
        super(len);
    }

    double volume() {
        return length * length * length;
    }

    double surfaceArea() {
        return 6 * length * length;
    }

}

// ----Cylinder Class
class Cylinder extends Shape {
    double PI = 3.14;

    Cylinder(double r, double h) {
        super(r, h);
    }

    double volume() {
        double val = PI * length * length * breadth;
        return val;
    }

    double surfaceArea() {
        double val = 2 * PI * super.length * super.breadth;
        return val;
    }
}

// ----Cuboid Class
class Cuboid extends Shape {
    Cuboid(double l, double b, double h) {
        super(l, b, h);
    }

    double volume() {
        return length * breadth * height;
    }

    double surfaceArea() {
        return 6 * length * breadth;
    }

}