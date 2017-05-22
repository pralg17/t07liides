import java.util.Scanner;

public class Arvutus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Sisesta silindri korgus: ");
		double h=sc.nextDouble();
		
		System.out.println("Sisesta silindri raadius: ");
		double r=sc.nextDouble();
		
		Liides pindala = new TaisPindala();
		System.out.println("Silindri taispindala on: "+ pindala.arvutus(h, r));
	}
}