package kirke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;
import prog.*;

@RestController
@SpringBootApplication
public class Rakendus {
	@Autowired
	HttpSession httpSession;

	
  @RequestMapping("/vahe")
	public String leiaVahe(int arv1, int arv2){
		Summeerija ladu=new HarilikSummeerija();
		ladu.lisa(arv1);
		ladu.lisa(-arv2);
		return "Kokku: "+ladu.kysi();
	}

	public static void main(String[] args) {
		System.getProperties().put("server.port", 4777);
		SpringApplication.run(Rakendus.class);
	}
}
