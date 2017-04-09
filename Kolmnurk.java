
class Kolmnurk implements GeoLiides {


    double alus;
    double korgus;
    double kaatet1;
    double kaatet2;

    public Kolmnurk(double alus, double korgus, double kaatet1, double kaatet2) {
        this.alus = alus;
        this.korgus = korgus;
        this.kaatet1 = kaatet1;
        this.kaatet2 = kaatet2;
    }


    public double umbermoot(double... arv){
        return  alus + kaatet1 + kaatet2;
    }

    public double pindala(double... arv){
        return (alus * korgus)/2;
    }
}
