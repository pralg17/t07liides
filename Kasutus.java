public class Kasutus{
	public static void main(String[] arg){
        Liides abiline2 = new LiideseKasutus2ga();
        System.out.println("2:");
        System.out.println("Korrutis: "+abiline2.korruta(3));
        System.out.println("Jaga: "+abiline2.jaga(abiline2.korruta(3)));
        System.out.println("Liida: "+abiline2.liida(abiline2.jaga(abiline2.korruta(3))));
        System.out.println("Lahuta: "+abiline2.lahuta(abiline2.liida(abiline2.jaga(abiline2.korruta(3)))));
        System.out.println("__________________________________________________");
        System.out.println("10:");
        Liides abiline10 = new LiideseKasutus10ga();
        System.out.println("Korrutis: "+abiline10.korruta(3));
        System.out.println("Jaga: "+abiline10.jaga(abiline10.korruta(3)));
        System.out.println("Liida: "+abiline10.liida(abiline10.jaga(abiline10.korruta(3))));
        System.out.println("Lahuta: "+abiline10.lahuta(abiline10.liida(abiline10.jaga(abiline10.korruta(3)))));

    }
		
}