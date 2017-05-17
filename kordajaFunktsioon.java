public class kordajaFunktsioon implements Funktsioon{
	
	double kordaja;
	
	public kordajaFunktsioon(double kordaja){
		
		this.kordaja=kordaja;
		
	}
	
	public double f(double x){
		
		return (x*kordaja);
		
	}
	
}