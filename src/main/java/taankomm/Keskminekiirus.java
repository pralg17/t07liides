package taankomm;

public class Keskminekiirus implements Liides{
	double v;
	public String f(double s, double h, double m){
		double t = h + (m/60);

		v = Math.round(s/t);

			return "Keskmine kiirus oli "+ v +" km/h.";

	}

}
