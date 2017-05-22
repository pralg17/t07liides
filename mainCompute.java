import java.util.Scanner;

public class mainCompute{

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    MyInterface getQuadratic = new Quadratic();

    System.out.println("Ruutvõrrandi arvutaja\n\nPalun sisestage ruutvõrrandi jaoks vajalikud andmed");
    System.out.println("A (ruudus): ");
    double a = scan.nextDouble();
    System.out.println("B: ");
    double b = scan.nextDouble();
    System.out.println("C: ");
    double c = scan.nextDouble();
    System.out.println("\nVastus 1: " + getQuadratic.compute(a, b, c, 1));
    System.out.println("Vastus 2: " + getQuadratic.compute(a, b, c, 2));
  }
}
