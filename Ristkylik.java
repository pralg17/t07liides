import java.util.*;
import java.util.Scanner;

public class Ristkylik{
	public static void main(String[] args){
		Liides Parvutamine = new Pindala();
		Liides Yarvutamine = new Ymbermqqt();
		Scanner scanning = new Scanner(System.in);
		
		System.out.println("Sisesta a:");
		double a=scanning.nextDouble();
		System.out.println("Sisesta b:");
		double b=scanning.nextDouble();
		System.out.println("Ristkylika pindala on:" + Yarvutamine.arvutamine(a,b));
		System.out.println("Ristkylika pindala on:" + Parvutamine.arvutamine(a,b));

	}
}
/*
Sisesta a:
3
Sisesta b:
4
Ristkylika pindala on:14.0
Ristkylika pindala on:12.0
*/