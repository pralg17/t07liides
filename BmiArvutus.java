package thetloffline;

public class BmiArvutus implements Funktsioon {
	public double bmi(double kaal, double pikkus) {
	    return Math.round(kaal / (pikkus*pikkus)*10000);
	}
}