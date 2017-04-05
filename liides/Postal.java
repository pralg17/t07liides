import java.text.DecimalFormat;

public class Postal {
	
	public static double calculate(Funktsioon fn, double x) {
		return fn.f(x);
	}
	
	
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		//maksumus regiooni kaupa
		Funktsioon shippingUSA = new Shipping(34.99);
		Funktsioon shippingAsia = new Shipping(39.99);
		Funktsioon shippingEurope = new Shipping(17.99);
		
		//paki kaal
		double item1 = calculate(shippingUSA, 10.5);
		double item2 = calculate(shippingEurope, 18.9);
		double item3 = calculate(shippingEurope, 2.5);
		double item4 = calculate(shippingAsia, 0.5);
		
		System.out.println("Maksumus on " + (item1 < 0 ? "viga" : format.format(item1)) + " eurot");
		System.out.println("Maksumus on " + (item2 < 0 ? "viga" : format.format(item2)) + " eurot");
		System.out.println("Maksumus on " + (item3 < 0 ? "viga" : format.format(item3)) + " eurot");
		System.out.println("Maksumus on " + (item4 < 0 ? "viga" : format.format(item4)) + " eurot");
		
		/* [karlbork@greeny liides]$ java Postal
		Maksumus on 44.44 eurot
		Maksumus on 46.34 eurot
		Maksumus on 19.24 eurot
		Maksumus on 40.24 eurot */
		
	}
	
}