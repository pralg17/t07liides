package baas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

import summeerimine.*;

@RestController
@SpringBootApplication


  public class rakendus {

    @Autowired
    HttpSession httpSession;

    @RequestMapping("/sessioon1")
    public String sessiooniproov(String teade){
      Object vastus = httpSession.getValue("sisu");
      httpSession.putValue("sisu",teade);
      return "Meeles oli "+vastus;
    }

    @RequestMapping("/tekst1")
    public String leiaTekst(String lause){

      if (httpSession.getValue("tekstihoidla")==null) {
        httpSession.putValue("tekstihoidla",new Tekstihariliksummeerija());
      }
      Tekstisummeerija uurija = (Tekstisummeerija)httpSession.getValue("tekstihoidla");

      uurija.lisa(lause);
      return "Lause: "+uurija.kysi()+"<br>"+"Pikkus: "+uurija.pikkus();
    }


    @RequestMapping("/summa1")
    public String leiaSumma(int arv1,int arv2){
      Summeerija ladu = new Hariliksummeerija();
      ladu.lisa(arv1);
      ladu.lisa(arv2);
      return "Kokku: "+ladu.kysi();
    }

    @RequestMapping("/summa2")
    public String leiaSumma(int arv){

      if (httpSession.getValue("hoidla")==null) {
        httpSession.putValue("hoidla",new Hariliksummeerija());
      }
      Summeerija ladu = (Summeerija)httpSession.getValue("hoidla");
      ladu.lisa(arv);
      return "Kokku: "+ladu.kysi();
    }

  public static void main(String[] args){
    System.getProperties().put("server.port",8080);
    SpringApplication.run(rakendus.class);
  }

}
