public class LiitmiseFunktsioon implements Funktsioon{
	double liidetav;
	public LiitmiseFunktsioon(double liidetav){
		this.liidetav=liidetav;
	}
	public double f(double x){
		return x+liidetav;
	}
}