import java.util.Scanner;

public class Kasutus1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		Liides pythagoroseArvutaja = new Pythagoros();
		System.out.println("a: ");
		double a=s.nextDouble();
		System.out.println("b: ");
		double b=s.nextDouble();
		System.out.println("c: "+ pythagoroseArvutaja.arvutus(a,b));
	}
}