import java.util.*;
public class Kasutus1{
	
	public static double arvuta(Funktsioon fn, double arv){
		
		return fn.f(arv);
		
	}
	
	public static double[] arvuta(Funktsioon fn, double[] arvud){
		
		double[] vastused=new double[arvud.length];
		
		for (int i=0; i<arvud.length; i++){
			
			vastused[i]=fn.f(arvud[i]);
			
		}
		
		return vastused;
		
	}
	
	public static double[][] arvuta(Funktsioon[] fnd, double[] arvud){
		
		double[][] v=new double[fnd.length][arvud.length];
		for(int i=0; i<fnd.length; i++){
			v[i]=arvuta(fnd[i], arvud);
		}
		return v;
	}
	
	public static void main(String[] arg){
		
		RuuduFunktsioon ruuduArvutaja=new RuuduFunktsioon();
		AstmeFunktsioon kuubiArvutaja=new AstmeFunktsioon(3);
		Funktsioon ruutjuureArvutaja=new AstmeFunktsioon(0.5);
		Funktsioon kordajaArvutaja=new kordajaFunktsioon(5);
		Funktsioon sentimeetritestTollideArvutaja=new kordajaFunktsioon(1/2.54);
		Funktsioon kilomeetritestMeetriteArvutaja=new kordajaFunktsioon(1000);
		Funktsioon keraRuumalaArvutaja=new VeebiFunktsioon("http://greeny.cs.tlu.ee:4213/keraruumala","raadius");
		System.out.println

		
		System.out.println(arvuta(ruuduArvutaja, 3));
		System.out.println(arvuta(kuubiArvutaja, 2));
		System.out.println(arvuta(ruutjuureArvutaja, 25));
		System.out.println(arvuta(kordajaArvutaja, 10));
		System.out.println(arvuta(sentimeetritestTollideArvutaja, 20));
		System.out.println(arvuta(kilomeetritestMeetriteArvutaja, 10));
	
	
		double[] andmed={3, 11, 7};
		double[] meetrid=arvuta(kilomeetritestMeetriteArvutaja, andmed);
		System.out.println(Arrays.toString(meetrid));
		
		
		Funktsioon[] arvutajad={kilomeetritestMeetriteArvutaja, ruuduArvutaja};
		double[][] vastustetabel=arvuta(arvutajad, andmed);
		System.out.println(Arrays.deepToString(vastustetabel));
	}
}

//Teen klassi kordajaFunktsioon, kus funktsiooni parameeter korrutatakse klassi
//eksemplari loomisel antud kordajaga
// Looge eksemplarid tollidest cm arvutamiseks JA km meetriteks arvutamiseks. Katsetage