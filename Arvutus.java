
import java.util.*;
import java.util.Scanner;

public class Arvutus{
	public static void main(String[] args){
		Liides ruumalaArvutaja = new Ruumala();
		Liides pindalaArvutaja = new Pindala();
		Scanner scanning = new Scanner(System.in);
		
		System.out.println("Sisesta pyramiidi p6hja pikkus: ");
		double a=scanning.nextDouble();
		System.out.println("Sisesta pyramiidi p6hja teine pikkus: ");
		double b=scanning.nextDouble();
		System.out.println("Sisesta pyramiidi k6rgus: ");
		double h=scanning.nextDouble();
		System.out.println("Sisesta pyramiidi kylje k6rgus: ");
		double w=scanning.nextDouble(); 
		System.out.println("Pyramiidi ruumala on: "+ruumalaArvutaja.arvutusIse(a,b,h,w));
		System.out.println("Pyramiidi pindala on: "+pindalaArvutaja.arvutusIse(a,b,h,w));
	}
}

//Sisesta pyramiidi p6hja pikkus:
//5
//Sisesta pyramiidi p6hja teine pikkus:
//6
//Sisesta pyramiidi k6rgus:
//4
//Sisesta pyramiidi kylje k6rgus:
//5
//Pyramiidi ruumala on: 120.0
//Pyramiidi ruumala on: 80.0
