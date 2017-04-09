public class Kasutus {
    static Kolmnurk kolmnurk = new Kolmnurk(10, 7, 8, 8);
    static Ruut ruut = new Ruut();
    static Ristkulik ristkulik = new Ristkulik();


    public static void main(String[] args) {
        System.out.println("Kolmnurga pindala on: " + kolmnurk.pindala());
        System.out.println("Kolmnurga ümbermõõt on: " + kolmnurk.umbermoot());
        System.out.println();

        System.out.println("Ruudu pindala on: " + ruut.pindala(5.0));
        System.out.println("Ruudu ümbermõõt on: " + ruut.pindala(5.0));
        System.out.println();

        System.out.println("Ristküliku pindala on: " + ristkulik.pindala(4.0, 2.0));
        System.out.println("Ristküliku ümbermõõt on: " + ristkulik.umbermoot(4.0, 2.0));
    }
}
