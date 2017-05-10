package paul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Rakendus {
    
    Funktsioon n = new TaisnurkseKolmnurgaArvutus();

	@RequestMapping("/kolmnurk")
    public double kolmnurkVeebis(double alus, double korgus) {
        return n.kolmnurk(alus, korgus);
    }

	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 4227);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar