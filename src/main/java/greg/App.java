package greg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {

	@RequestMapping("/")
    public String kasklused() {
        return "/arvutaneto?bruto=1000	 /kroonideks?eurod=1000";
    }
	
	@RequestMapping("/arvutaneto")
    public String arvutaneto(double bruto) {
		Neto netoArvutaja = new Neto();
        return netoArvutaja.fn(bruto);
    }

    @RequestMapping("/kroonideks")
    public String arvutakroonid(double eurod) {
        Kroon krooniArvutaja = new Kroon();
        return krooniArvutaja.fn(eurod);
    }    
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4299);
        SpringApplication.run(App.class, args);
    }

}