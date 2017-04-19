public class valuuta implements liides{
    double kordaja;
    public valuuta(double kordaja){
        this.kordaja=kordaja;
    }
    public double l(double x){
        return x*kordaja;
    }
}