package jaagup;

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

  @RequestMapping("/sessioon1")
  public String sessiooniProov(String teade){
    Object vastus = httpSession.getValue("sisu");
    httpSession.putValue("sisu", teade);
    return "Meeles oli: "+vastus;
  }

  @RequestMapping("/summa2")
  public String lisatavSumma(int arv){
    if(httpSession.getValue("hoidla")==null){
        httpSession.putValue("hoidla", new HarilikSummeerija());
    }
    Summeerija ladu = (Summeerija)httpSession.getValue("hoidla");
    ladu.lisa(arv);
    return "Kokku: "+ladu.kysi();
  }

  @RequestMapping("/summa3")
  public String lisatavTekst(String lisatekst){
    if(httpSession.getValue("hoidla")==null){
        httpSession.putValue("hoidla", new TekstiHarilikSummeerija());
    }
    TekstiSummeerija ladu = (TekstiSummeerija)httpSession.getValue("hoidla");
    ladu.lisa(lisatekst);
    return "Kokku: "+ladu.kysi()+"<br>"+"Pikkus: "+ladu.pikkus();
  }





	@RequestMapping("/summa1")
	public String leiaSumma(int arv1, int arv2){
		Summeerija ladu=new HarilikSummeerija();
		ladu.lisa(arv1);
		ladu.lisa(arv2);
		return "Kokku: "+ladu.kysi();
	}
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4302);
		SpringApplication.run(Rakendus1.class);
	}
}
