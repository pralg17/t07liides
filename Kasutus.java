import java.util.*;

public class Kasutus{
	public static void main(String[] arg){
        Romb pindala = new Pindala();
		Romb umbermoot = new Umbermoot();
		Scanner scanning = new Scanner(System.in);
		
		System.out.println("\nSisesta rombi külg: ");
 		double a=scanning.nextDouble();
		System.out.println("Sisesta rombi 1 diagonaal: ");
 		double d1=scanning.nextDouble();
		System.out.println("Sisesta rombi 2 diagonaal: ");
 		double d2=scanning.nextDouble();
		
		System.out.println("\nRombi pindala on " + pindala.f(d1,d2,a));
		System.out.println("Rombi umbermoot on " + umbermoot.f(a,d1,d2));
		
    }
}
 
 /*
 Sisesta rombi külg:
3
Sisesta rombi 1 diagonaal:
4
Sisesta rombi 2 diagonaal:
5

Rombi pindala on 10.0
Rombi umbermoot on 12.0
 */