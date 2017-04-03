package greg;

public class Neto implements Liides{
	double tulumaksumaar = 0.2;
	double tulumaksuvabatulu = 180.0;
	double tootuskindlustusmaksemaar = 0.024;
	double kogumispensionimaksemaar = 0.02;
	
	public String fn(double var){
		double netop = ((var - tulumaksuvabatulu) - 
		(var*tulumaksumaar+var*tootuskindlustusmaksemaar+var*kogumispensionimaksemaar)) +
		tulumaksuvabatulu;
		
		String netopalk = String.valueOf(netop);
		return "Aastal 2017: " + netopalk + " eurot";
	}
}