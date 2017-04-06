package jaagup;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Veebiliides{
	@RequestMapping("/faktoriaal")
	int faktor(int number){
		int f = 1;
		for (int i = 1; i<=number;++i){
		f*=i;}
		return f;
		
	}
	
	public static void main(String[] args){
		System.getProperties().put("server.port",4012);
		SpringApplication.run(Veebiliides.class,args);
	}
  //http://greeny.cs.tlu.ee:4021/faktoriaal?number=4	
  24
}