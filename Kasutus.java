import java.util.*;

public class Kasutus{
	public static void main(String[] arg){
		Silinder pohjapindala = new Pohjapindala();
		Silinder kylgpindala = new Kylgpindala();
		Silinder t2ispindala = new T2ispindala();
		Silinder ruumala = new Ruumala();
		Scanner scanning = new Scanner(System.in);
		
		System.out.println("\nSisesta silindri põhja raadius: ");
 		double r=scanning.nextDouble();
		System.out.println("Sisesta silindri kõrgus: ");
 		double H=scanning.nextDouble();
		
		System.out.println("\nSilindri põhjapindala on " + pohjapindala.f(r,H));
		System.out.println("Silindri külgpindala on " + kylgpindala.f(r,H));
		System.out.println("Silindri täispindala on " + t2ispindala.f(r,H));
		System.out.println("Silindri ruumala on " + ruumala.f(r,H) + "\n");
	}
}

/*
[raitkeer@greeny t07liides]$ java Kasutus

Sisesta silindri põhja raadius:
5
Sisesta silindri kõrgus:
10

Silindri põhjapindala on 78.53981633974483
Silindri külgpindala on 314.1592653589793
Silindri täispindala on 471.23889803846896
Silindri ruumala on 785.3981633974483

[raitkeer@greeny t07liides]$
*/
