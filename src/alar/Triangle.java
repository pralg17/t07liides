package alar;

/**
 * Created by AASA on 03.04.2017.
 */
public class Triangle implements Shape {
    private double a,b,c,h;

    public Triangle(double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getPerimeter(){
        return a+b+c;
    }

    @Override
    public double getSurfaceArea(){
        return 0.5*(b*h);
    }

    @Override
    public boolean getPossibility(){
        if(a+b>c && b+c>a && a+c>b){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        if (getPossibility()){
            return "a="+ a +" b="+ b +" c="+ c +"\nRectangle area: " + getSurfaceArea() + "\nRectangle perimeter: " + getPerimeter();
        } else {
            return "Triangle not possible";
        }
    }
}
