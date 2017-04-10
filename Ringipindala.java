
public class Ringipindala implements Liides{
	public String f(double r){
		double S = Math.PI * (r*r);

		r = Math.round(S);

			return "Ringi pindala on ligikaudu "+ r +" cm2";
			
			

	}
	public String c(double r) {
		double C = Math.PI * 2 * r;
		
		r = Math.round(C);
		
			return "Ringi ymbermoot on ligikaudu "+ r + "cm";
		
				
	}
	


}