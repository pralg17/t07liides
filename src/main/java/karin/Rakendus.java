package karin;
import kuvamine.*;
import java.io.*;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus{
	
	@RequestMapping("/aprilliuudis")
    String uudis1(String pealkiri, String sisu){
        PealkirjagaTekst pt1 = new PealkirjagaTekst(pealkiri, sisu);
        return "<!doctype html><html><body>"+pt1.html()+"</body></html>";
    }
	
	@RequestMapping("/valuutakursid")
    String valuutakursid()throws IOException{
		TabelVeebist tulp1 = new TabelVeebist("http://www.seb.ee/valuutakursid", "Valuuta nimetus");
		TabelVeebist tulp2 = new TabelVeebist("http://www.seb.ee/valuutakursid", "Valuuta tähis");
		TabelVeebist tulp3 = new TabelVeebist("http://www.seb.ee/valuutakursid", "Euroopa Keskpanga kurss");
		PealkirjagaTulp esimene = new PealkirjagaTulp(tulp1.tulp);
		PealkirjagaTulp teine = new PealkirjagaTulp(tulp2.tulp);
		PealkirjagaTulp kolmas = new PealkirjagaTulp(tulp3.tulp);
		ReasPaigutus valuutakursid= new ReasPaigutus();
		valuutakursid.lisaElement(esimene);
		valuutakursid.lisaElement(teine);
		valuutakursid.lisaElement(kolmas);
        return "<!doctype html><html><body>"+valuutakursid.html()+"</body></html>";
    }
	
	@RequestMapping("/katse")   
	/*näiteks
	katse?url=https://fp.lhv.ee/market,,&pealkiri=Nimetus,Viimane,Muutus
	katse?url=http://www.seb.ee/valuutakursid,,&pealkiri=Valuuta nimetus,Pank müüb Ülekanne,Pank ostab Ülekanne
	*/
    String valuutakursid(String url, String pealkiri)throws IOException{
		String[] urliabi = url.split(",",-1);
		String[] pealkirjaabi = pealkiri.split(",",-1);
		int sisestusi = 0;    //url v pealkiri sisestuste arv aadressireal
		ReasPaigutus valuutakursid = new ReasPaigutus();
		
		if(urliabi.length < pealkirjaabi.length){
			sisestusi = urliabi.length;
		}else{
			sisestusi = pealkirjaabi.length;
		}
		
		for(int i = 0; i < sisestusi; i++){
			if(urliabi[0] == null || urliabi[0].equals("")){
				urliabi[0] = "http://www.seb.ee/valuutakursid";
			}
			if(urliabi[i] == null || urliabi[i].equals("")){
				urliabi[i] = urliabi[0];           //esimesena sisestatud aadress, kui teisi pole määratud
			}
			if(pealkirjaabi[i] == null || pealkirjaabi[i].equals("")){
				pealkirjaabi[i] = "";
			}
			valuutakursid.lisaElement(new PealkirjagaTulp(new TabelVeebist(urliabi[i].trim(), pealkirjaabi[i].trim()).tulp));
		}
		return "<!doctype html><html><body>"+valuutakursid.html()+"</body></html>";
    }

	public static void main(String[] args){
		System.getProperties().put("server.port", 2412);
		SpringApplication.run(Rakendus.class, args);
 
	}
}


//scl enable rh-maven33 bash
//mvn package
//java -jar target/kodune-0.0.1-SNAPSHOT.jar


