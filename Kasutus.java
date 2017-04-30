public class Kasutus{
    public static void main(String[] args) {
        Liides ruutjuureArvutaja = new Ruutjuur();
        System.out.println("Ruutjuur arvust on: "+ ruutjuureArvutaja.f(25));
    }
}

/* 
[brigkann@greeny t07liides]$ javac *.java
[brigkann@greeny t07liides]$ java Kasutus
Ruutjuur arvust on: 5.0
*/