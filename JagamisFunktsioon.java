public class JagamisFunktsioon implements Funktsioon{
	double jagaja;
	public JagamisFunktsioon(double jagaja){
		this.jagaja=jagaja;
	}
	public double f(double x){
		return x/jagaja;
	}
	
}