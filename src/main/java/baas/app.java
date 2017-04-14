package baas;

 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 @RestController
 @SpringBootApplication
 public class app {

 	@RequestMapping("/arvutaringipindala")
     public String arvutapindalaring(double raadius) {
 		Ring pindalaarvutaja = new Ring();
        String vastus = String.valueOf(pindalaarvutaja.pindala(raadius));
 		return vastus;
     }

     @RequestMapping("/arvutaruudupindala")
     public String arvutapindalaruut(double kulg) {
         Ruut pindalaarvutaja = new Ruut();
         String vastus = String.valueOf(pindalaarvutaja.pindala(kulg));
 		 return vastus;
     }

     public static void main(String[] args) {
 		System.getProperties().put("server.port", 1717);
         SpringApplication.run(app.class, args);
     }

 }
