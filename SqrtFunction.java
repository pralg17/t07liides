import java.io.*;

public class SqrtFunction implements Function{
	double Square;
	public String f(double x){
		Square = Math.sqrt(x);
		
		String text = Double.toString(Math.abs(Square));
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
		int Answer = integerPlaces+decimalPlaces;
		
		
		if(text.substring(Answer).equals("0")){
			return "Number "+x+" square root is "+Square;
		}else if (x<0){
			return "That aint a suitable number, boi! ("+x+")";
		}else{
			
			return "Number "+x+" square root is not a precise number.  ("+Square+")";
		}
	}
	
}