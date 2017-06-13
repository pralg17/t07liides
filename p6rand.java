import java.util.*;
import java.util.Scanner;

public class P6rand{
	public static void main(String[] args){
		Liides Ppindala = new P6randapindala();
		Liides Pymberm66t = new P6randaymberm66t();
		Scanner scanning = new Scanner(System.in);
		
		System.out.println("Sisesta poranda esimese kulje pikkus:");
		double a=scanning.nextDouble();
		System.out.println("Sisesta poranda teise kulje pikkus:");
		double b=scanning.nextDouble();
		System.out.println("poranda umbermoot on:" + Ppindala.arvud(a,b)+" meetrit");
		System.out.println("poranda pindala on:" + Pymberm66t.arvud(a,b)+" ruutmeetrit");

	}
}

/*

C:\Users\User\java\07>java P6rand
Sisesta poranda esimese kulje pikkus:
5
Sisesta poranda teise kulje pikkus:
4
poranda umbermoot on:20.0 meetrit
poranda pindala on:18.0 ruutmeetrit

C:\Users\User\java\07>

*/