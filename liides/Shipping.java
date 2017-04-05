public class Shipping implements Funktsioon {
	
	double rate;
	
	public Shipping(double rate) {
		this.rate = rate;
	}
	
	public double f(double weight) {
		
		double weightTax = 0.0;
		
		if(weight > 20 || weight < 0) {
			weightTax = -1 * rate;
		} else if(weight <= 20 && weight > 14) {
			weightTax = 1.5;
		} else if(weight <= 14 && weight > 8) {
			weightTax = 0.9;
		} else if(weight <=8) {
			weightTax = 0.5;
		}
		
		double price = weight * weightTax + rate;
		
		return price;
	}
}