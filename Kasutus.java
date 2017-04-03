import java.lang.*;
public class Kasutus{	
		public static double arvuta(Funktsioon fn, double arv){
		return fn.f(arv);
	}
	
	public static void main(String[] arg){
		LiitmiseFunktsioon liitja=new LiitmiseFunktsioon(10);
		LahutamiseFunktsioon lahutaja=new LahutamiseFunktsioon(5);
		SiinuseFunktsioon siinus=new SiinuseFunktsioon(Math.toRadians(30));
		KoosinuseFunktsioon koosinus=new KoosinuseFunktsioon(Math.toRadians(60));
		System.out.println(arvuta(liitja, 4));
		System.out.println(arvuta(lahutaja, 7));
		System.out.println(arvuta(siinus, Math.toRadians(30)));
		System.out.println(arvuta(koosinus, Math.toRadians(60)));
	}
}