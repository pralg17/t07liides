public class Kasutus{
    public static void main(String[] args) {
        Liides ruutjuureArvutaja = new Ruutjuur();
        System.out.println("Ruutjuur arvust on: "+ ruutjuureArvutaja.f(100));
    }
}

/* 
[gittkaus@greeny t07liides]$ javac *.java
[gittkaus@greeny t07liides]$ java Kasutus
Ruutjuur arvust on: 10.0
*/