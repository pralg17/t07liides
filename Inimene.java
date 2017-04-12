public class Inimene implements Liides{

    private int vanus;
    private float kaal, pikkus;
    private String eesnimi, perekonnanimi;

    public Inimene(String eesnimi, String perekonnanimi, int vanus, float kaal, float pikkus){
        if(eesnimi==null || eesnimi.length()==0){
            this.eesnimi = "eesnimi puudub";
        }else{
            this.eesnimi = eesnimi;
        }

        if(perekonnanimi==null || perekonnanimi.length()==0){
            this.perekonnanimi = "perekonnanimi puudub";
        }else{
            this.perekonnanimi = perekonnanimi;
        }
        
        this.vanus = vanus;        
        this.kaal = kaal;        
        this.pikkus = pikkus;
        
        
    }
    @Override
    public void info(){
        System.out.println("Nimi: "+eesnimi+" "+perekonnanimi);
    }

}