

import java.util.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Liides t2ispindalaArvuta = new t2ispindala();
		Liides pohjapindalaArvuta = new pohjapindala();
		Liides kylgpindalaArvuta = new kyljepindala();
		Liides Ruumala = new Ruumala();
		Scanner scanning = new Scanner(System.in);
		//***
		System.out.println("Sisesta  alumis serva pikkus: ");
		double a=scanning.nextDouble();
		System.out.println("Sisesta  k6rguse pikkus: ");
		double b=scanning.nextDouble();
		//**
		System.out.println("t2ispindala on: "+t2ispindalaArvuta.arvutamine(a,b));
		System.out.println("pohjapindala on: "+pohjapindalaArvuta.arvutamine(a,b));
		System.out.println("kyljepindala on: "+kylgpindalaArvuta.arvutamine(a,b));
		System.out.println("Ruumala on: "+Ruumala.arvutamine(a,b));
	}
}