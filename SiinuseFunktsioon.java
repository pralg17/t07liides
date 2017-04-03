import java.lang.*;
public class SiinuseFunktsioon implements Funktsioon{
	double nurk;
	public SiinuseFunktsioon(double nurk){
		this.nurk=nurk;
	}
	public double f(double x){
		return Math.sin(x);
	}
}