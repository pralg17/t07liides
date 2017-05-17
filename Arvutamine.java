import java.util.*;
 import java.util.Scanner;

 public class Arvutamine{
 	public static void main(String[] args){
 		Liides ruumalaArvutaja = new Ruumala();
 		Liides pindalaArvutaja = new Pindala();
    Liides kulgpindalaArvutaja = new Kulgpindala();
 		Scanner scanning = new Scanner(System.in);

 		System.out.println("Sisesta risttahuka kõrgus cm: ");
 		double a=scanning.nextDouble();
 		System.out.println("Sisesta risttahuka pikkus cm: ");
 		double b=scanning.nextDouble();
 		System.out.println("Sisesta risttahuka laius cm: ");
 		double c=scanning.nextDouble();
 		System.out.println("Risttahuka kulgpindala on: "+kulgpindalaArvutaja.iseArvutus(a,b,c)+"cm.");
 		System.out.println("Risttahuka ruumala  on: "+ruumalaArvutaja.iseArvutus(a,b,c)+"cm2");
    System.out.println("Risttahuka pindala   on: "+pindalaArvutaja.iseArvutus(a,b,c)+"cm");
 	}
 }

 
