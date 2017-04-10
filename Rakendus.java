public class Rakendus{
    public static void main(String[] args) {
        Liides pindalaArvutaja = new Ringipindala();
        System.out.println(pindalaArvutaja.f(4));
		System.out.println(pindalaArvutaja.c(4));
		System.out.println(pindalaArvutaja.f(2));
		System.out.println(pindalaArvutaja.c(2));
		System.out.println(pindalaArvutaja.f(15));
		System.out.println(pindalaArvutaja.c(15));
		System.out.println(pindalaArvutaja.f(18));
		System.out.println(pindalaArvutaja.c(18));
		
		
    }
	
}




/*	javac *.java
	java Rakendus
	
	Ringi pindala on ligikaudu 50.0 cm2
	Ringi ymbermoot on ligikaudu 25.0cm
	Ringi pindala on ligikaudu 13.0 cm2
	Ringi ymbermoot on ligikaudu 13.0cm
	Ringi pindala on ligikaudu 707.0 cm2
	Ringi ymbermoot on ligikaudu 94.0cm
	Ringi pindala on ligikaudu 1018.0 cm2
	Ringi ymbermoot on ligikaudu 113.0cm



*/