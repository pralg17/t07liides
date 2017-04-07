package taankomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class Aplikatsioon{

	@RequestMapping("/arvutaKiirus")
	public String arvutaKiirus(double s, double h, double m){
		Keskminekiirus kiiruseArvutaja=new Keskminekiirus();
		return kiiruseArvutaja.f(s,h,m);
	}


	public static void main(String[] args) {
	 		//System.getProperties().put("server.port", 4225);
			SpringApplication.run(Aplikatsioon.class, args);
		}
}
