import java.util.*;
public class kasutus{
    public static double arvuta(liides l, double arv){
        return l.l(arv);
    }
    public static void main(String[] arg){
        liides dollaridEurodeks=new valuuta(0.93);
        liides naeladEurodeks=new valuuta(1.19);
        liides eurodJeenideks=new valuuta(116.61);
        System.out.println(arvuta(dollaridEurodeks, 20));
        System.out.println(arvuta(naeladEurodeks, 20));
        System.out.println(arvuta(eurodJeenideks, 20));
    }
}