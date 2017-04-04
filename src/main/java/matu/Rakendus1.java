package matu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;
import summeerimine.*;

@RestController
@SpringBootApplication
public class Rakendus1 {
	@Autowired
	HttpSession httpSession;
	
	//http://localhost:5555/sõnad?words=Kala ujub vees
	//http://localhost:5555/sõnad?words=Hunt jookseb metsas
	//http://localhost:5555/sõnad?words=Ämblikud koovad võrku
	//http://localhost:5555/sõnad?words=Karu magab talvel talveund. Linnud lendavad lõunamaale
	@RequestMapping("/sõnad")
	public String tekstiUuring(String words){
		if(httpSession.getValue("tekstihoidla")==null){
			httpSession.putValue("tekstihoidla", new HarilikS6nadeSummeerija());
		}
		S6nadeSummeerija uurija=(S6nadeSummeerija)httpSession.getValue("tekstihoidla");
		uurija.lisa(words);
		return uurija.kysi();
	}
	
	//http://localhost:5555/pikkused
	@RequestMapping("/pikkused")
	public int tekstiPikkus(){
		S6nadeSummeerija uurija=(S6nadeSummeerija)httpSession.getValue("tekstihoidla");
		return uurija.pikkus();
	}
	
	//http://localhost:5555/mitukordaA
	@RequestMapping("/mitukordaA")
	public int mituKordaA(){
		S6nadeSummeerija uurija=(S6nadeSummeerija)httpSession.getValue("tekstihoidla");
		return uurija.mitutükkiA();
	}
	
	//http://localhost:5555/mitukordaM
	@RequestMapping("/mitukordaM")
	public int mituKordaM(){
		S6nadeSummeerija uurija=(S6nadeSummeerija)httpSession.getValue("tekstihoidla");
		return uurija.mitutükkiM();
	}
	
	//http://localhost:5555/paljusõnu
	@RequestMapping("/paljusõnu")
	public int paljuSõnu(){
		S6nadeSummeerija uurija=(S6nadeSummeerija)httpSession.getValue("tekstihoidla");
		return uurija.paljusõnuon();
	}
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4207);
		SpringApplication.run(Rakendus1.class);
	}
}