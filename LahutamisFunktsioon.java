public class LahutamisFunktsioon implements Funktsioon{
	double lahutaja;
	public LahutamisFunktsioon(double lahutaja){
		this.lahutaja=lahutaja;
	}
	public double f(double x){
		return x-lahutaja;
	}
	
}