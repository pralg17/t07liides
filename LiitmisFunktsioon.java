public class LiitmisFunktsioon implements Funktsioon{
	double liitja;
	public LiitmisFunktsioon(double liitja){
		this.liitja=liitja;
	}
	public double f(double x){
		return x+liitja;
	}
	
}