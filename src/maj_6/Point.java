package maj_6;

public class Point {
    //Napisz klasę Point, która reprezentuje punkt w przestrzeni dwuwymiarowej,
    // posiada dwie wartości liczbowe x oraz y. Klasa powinna zawierać akcesory oraz konstruktor.

    //W klasie Point zaimplementuj metodę getDistance(Point anotherPoint), która zwraca odległość tego punktu od drugiego punktu.
    private Float x;
    private Float y;

    //konstruktor
    public Point(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance (Point anotherPoint){
        double c = anotherPoint.x;
        double d = anotherPoint.y;
        return Math.sqrt(((c-x)*(c-x)) + ((d-y)*(d-y)));

    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }
}