public class Kasutus{
    public static void main(String[] args){
        Inimene isik1 = new Inimene("Oscar August", "Heinla", 24, 85, 176);
        isik1.info();

        Inimene isik2 = new Inimene("Erki", "", 45, 85, 174);
        isik2.info();
    }
}

/*
PS C:\Users\oscar\Desktop\Kool\JAVA\liides\t07liides> java Kasutus
Nimi: Oscar August Heinla
Nimi: Erki perekonnanimi puudub*/