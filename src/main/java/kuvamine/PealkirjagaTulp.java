package kuvamine;
import java.util.*;

public class PealkirjagaTulp implements VeebisKuvatav{
	ArrayList<String> tulp = new ArrayList<String>();
  
	public PealkirjagaTulp(ArrayList<String> massiiv){
		tulp = massiiv; 
	}
	
	public String html(){
		StringBuffer sb = new StringBuffer();
		VeebiTekst pealkiri = new VeebiTekst(tulp.get(0));
		sb.append("<h4>" + pealkiri.html() + "</h4>");      //pärast < ja > asendamist tulba pealkiri puhvrisse
		for(int i = 1; i < tulp.size(); i++){
			VeebiTekst rida = new VeebiTekst(tulp.get(i));
			sb.append(rida.html() + "<br>");               //päras < ja > asendamist tulba read puhvrisse
		}
    //System.out.println(sb);
    return sb.toString();
  } 
}