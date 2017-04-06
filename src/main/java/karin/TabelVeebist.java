package karin;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;
import java.util.*;

public class TabelVeebist{
  
	ArrayList<String> tulp = new ArrayList<String>();
 
	public TabelVeebist()throws IOException{
		this("http://www.seb.ee/valuutakursid", "Valuuta nimetus");
	}
  
	public TabelVeebist(String url)throws IOException{
		this(url, "");                                      //Pealkirja pole
	}
  
	public TabelVeebist(String url, String tulbaPealkiri) throws IOException{
		Document doc;
		Element tabel;
		int indeks = 0;                                   //Kui pealkirja pole, siis võetakse esimene tulp, tulba nimeks Andmed
		String pealkiri = "Andmed";
        try{
			doc = Jsoup.connect(url).get();
			tabel = doc.select("table").get(0);
            //klassi nimega oleks: tabel = doc.select("table[class =mobile-hide sortable]");
        }catch(Exception ex) {
			doc = Jsoup.connect("http://www.seb.ee/valuutakursid").get();
			tabel = doc.select("table").get(0);
        }   
        Elements read = tabel.select("tr");
        Elements pealkirjad = tabel.select("th");
          
        for (int i = 0; i < pealkirjad.size(); i++){      
            if(pealkirjad.get(i).text().equals(tulbaPealkiri)){
				indeks = i;                               //Kui pealkiri saadakse tabelist, võetakse pealkirjale vastav tulp
                pealkiri = pealkirjad.get(i).text();        
            }  
        }
        tulp.add(pealkiri);                               //Tulba pealkiri
         
        for (int i = 0; i < read.size(); i++){          
            Element rida = read.get(i);
            Elements andmed = rida.select("td");
            for(int j = 0; j < andmed.size(); j++){
                if (j == indeks){
                    tulp.add(andmed.get(j).text());      //Pealkirjale vastava tulba andmed
                } 
            }
        }
	}
}
