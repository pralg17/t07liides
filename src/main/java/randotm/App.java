package randotm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class App {

    @RequestMapping("/")
    public String kasklused() {
        return "Astendamine: /astenda?arv=2";
    }
    
    @RequestMapping("/astenda")
    public String astenda(double arv) {
        Funkts funktsioon = new Funkts();
        return "Arv " + arv + " astendatud iseendaga on: " + funktsioon.fn(arv);
    }

    public static void main(String[] args) {
        System.getProperties().put("server.port", 4200);
        SpringApplication.run(App.class, args);
	}

}
