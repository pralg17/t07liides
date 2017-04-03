import java.util.*;
public class Kasutus1{

	public static String arvuta(Funktsioon fn, double arv){
		return fn.f(arv);
	}

	
	public static void main(String[] arg){
		System.out.println("Kas arvu ruutjuur on täpne arv ?");
		RuuduFunktsioon ruuduArvutaja=new RuuduFunktsioon();
		System.out.println(arvuta(ruuduArvutaja, -25));
		System.out.println(arvuta(ruuduArvutaja, 17));
		System.out.println(arvuta(ruuduArvutaja, -14));
		System.out.println(arvuta(ruuduArvutaja, 100));
		System.out.println(arvuta(ruuduArvutaja, -14));
		System.out.println(arvuta(ruuduArvutaja, 0));

	}
}