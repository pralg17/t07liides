import java.util.Scanner;

public class Arvutus1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		Liides pythagoraseArvutaja = new Pythagoras();
		System.out.println("a: ");
		double a=s.nextDouble();
		System.out.println("b: ");
		double b=s.nextDouble();
		System.out.println("c: "+ pythagoraseArvutaja.arvutus(a,b));
	}
}