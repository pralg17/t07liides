package homework_inerfaces;

/**
 * Created by User on 30-Mar-17.
 */
public class Rectangle implements IGeometrical {

   private double a,b;

  public   Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (a+b) * 2;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
