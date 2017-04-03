package homework_inerfaces;

/**
 * Created by User on 31-Mar-17.
 */
public class Circle implements IGeometrical {

    private double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double getPerimeter() {
        return Math.rint(2 * Math.PI * r * 100.0) / 100.0;
    }

    @Override
    public double getArea() {
        return Math.rint(Math.PI * Math.pow(r,2) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
