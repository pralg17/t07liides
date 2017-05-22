public class Quadratic implements MyInterface {
  public double compute(double a, double b, double c, int iteration) {
    double answer = 0;
    if (iteration == 1) {
      answer = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }
    if (iteration == 2) {
      answer = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }
    return answer;
  }

}
