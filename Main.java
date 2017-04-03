package homework_inerfaces;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by User on 30-Mar-17.
 */
public class Main {

    public static void calculate(ArrayList<IGeometrical> figureList) {  // funckcija, kotoraja perevod vse chisla v massive ispolzaja nuznuju fuknciju,


        for (IGeometrical figure : figureList) {
            System.out.println(figure.toString() + "\nPerimeter is: " + figure.getPerimeter() + "\nArea is: " + figure.getArea() + "\n");
        }
    }

    public static IGeometrical biggestFigure(ArrayList<IGeometrical> figureList) {

        IGeometrical biggest = figureList.get(0);

        for (int i = 1; i <figureList.size() ; i++) {
            if(biggest.getPerimeter() < figureList.get(i).getPerimeter()){
                biggest = figureList.get(i);
            }

        }
        return biggest;
    }
    // return list;


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(9, 6);

        Circle circle = new Circle(4);


        ArrayList<IGeometrical> figures = new ArrayList<IGeometrical>();

        figures.add(rectangle);
        figures.add(rectangle2);
        figures.add(circle);
        figures.add(new Circle(5));


        calculate(figures);

        System.out.println("Biggest figure: "+biggestFigure(figures));
    }
}
