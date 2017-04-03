public class LahutamiseFunktsioon implements Funktsioon{
	double lahutaja;
	public LahutamiseFunktsioon(double lahutaja){
		this.lahutaja=lahutaja;
	}
	public double f(double x){
		return x-lahutaja;
	}
}