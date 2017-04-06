import java.util.*;
public class Kasutus1{
	public static double arvuta(Funktsioon fn, double arv){
		return fn.f(arv);
	}
	public static double[] arvuta(Funktsioon fn, double[] arvud){
		double[] vastused=new double [arvud.length];
		for(int i=0; i<arvud.length; i++){
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
		Funktsioon liitmisArvutaja=new LiitmisFunktsioon(5);
		Funktsioon lahutamisArvutaja=new LahutamisFunktsioon(3);
		Funktsioon jagamisArvutaja=new JagamisFunktsioon(25);
		
		double[] andmed={3, 11, 7};
		Funktsioon[] arvutajad={liitmisArvutaja, jagamisArvutaja};
		double[][]vastustetabel=arvuta(arvutajad, andmed);
		System.out.println(Arrays.deepToString(vastustetabel));
		
		System.out.println(arvuta(liitmisArvutaja, 3));
		System.out.println(arvuta(lahutamisArvutaja, 2));
		System.out.println(arvuta(jagamisArvutaja, 25));
	}
}