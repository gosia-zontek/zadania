package maj_6;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    //Napisz klasę Circle, która reprezentuje figurę koła w przestrzeni dwuwymiarowej.
    // Posiada referencję do obiektu Point, który jest środkiem tego koła,
    // oraz wartość liczbową radius, która jest promieniem tego koła.

    //W klasie Circle zaimplementuj metody getCircumference(),
    // która zwraca obwód tego koła, oraz getArea(), która zwraca pole tego koła.
    private Point center;
    private Float radius;
    public Circle(Float radius, Point center) {
        this.radius = radius;
        this.center = center;

    }
    public double area() {
        return PI * pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }


}

