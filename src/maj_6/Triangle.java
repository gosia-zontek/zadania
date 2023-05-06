package maj_6;

public class Triangle {

    // Napisz klasę Triangle , która reprezentuje trójkąt w przestrzeni dwuwymiarowej.
    // Posiada trzy wierzchołki (Point) i ma metodę getCircumference(),
    // która zwraca obwód tego trójkąta,
    // oraz getArea(), która zwraca pole tego trójkąta (za pomocą Wzoru Herona).


    private Point pointA;
    private Point pointB;
    private Point pointC;

    //konstruktor
    public Triangle(Point pointA, Point pointB, Point pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC= pointC;
    }

    public double getCircumference(){
        return pointA.getDistance(pointB) + pointB.getDistance(pointC) + pointC.getDistance(pointA);
    }

    public double getArea(){
        double a = pointA.getDistance(pointB);
        double b = pointB.getDistance(pointC);
        double c = pointC.getDistance(pointA);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)+(p-b)*(p-c));
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
