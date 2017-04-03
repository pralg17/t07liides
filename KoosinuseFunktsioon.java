import java.lang.*;
public class KoosinuseFunktsioon implements Funktsioon{
	double nurk;
	public KoosinuseFunktsioon(double nurk){
		this.nurk=nurk;
	}
	public double f(double x){
		return Math.cos(x);
	}
}