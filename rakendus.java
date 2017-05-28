import java.util.*;

public class rakendus{
	
    public static double arvuta(liides l, double arv){
        return l.l(arv);
    }
	
    public static void main(String[] arg){
        liides tollid_meetriteks=new mootuhik(0.0254);
        liides jalad_meetriteks=new mootuhik(0.3048);
        liides jardid_meetriteks=new mootuhik(0.9144);
        liides miilid_meetriteks=new mootuhik(1609.344);
		
        System.out.println(arvuta(tollid_meetriteks, 125));
        System.out.println(arvuta(jalad_meetriteks, 6.23));
        System.out.println(arvuta(jardid_meetriteks, 12));
        System.out.println(arvuta(miilid_meetriteks, 60));
    }
}