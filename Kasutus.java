public class Kasutus{
    public static void main(String[] args) {
        Interface kuupjuureArvutaja = new Kuupjuur();
        System.out.println("Kuupjuur arvust 512 on: "+ kuupjuureArvutaja.f(512));
        System.out.println("Kuupjuur arvust 125 on: "+ kuupjuureArvutaja.f(125));
        System.out.println("Kuupjuur arvust 27 on: "+ kuupjuureArvutaja.f(27));
        System.out.println("Kuupjuur arvust 64 on: "+ kuupjuureArvutaja.f(64));
        System.out.println("Kuupjuur arvust 1024 on: "+ kuupjuureArvutaja.f(1024));
    }
}


/*
[siimhuts@greeny t07liides]$ java Kasutus
Kuupjuur arvust 512 on: 8.0
Kuupjuur arvust 125 on: 5.0
Kuupjuur arvust 27 on: 3.0
Kuupjuur arvust 64 on: 4.0
Kuupjuur arvust 1024 on: 10.079368399158986
[siimhuts@greeny t07liides]$

*/
