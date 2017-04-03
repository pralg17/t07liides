import java.io.*;
public class RuuduFunktsioon implements Funktsioon{
	double ruutjuur;
	public String f(double x){
		ruutjuur = Math.sqrt(x);
		
		String text = Double.toString(Math.abs(ruutjuur));
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
		int vastus = integerPlaces+decimalPlaces;
		
		
		if(text.substring(vastus).equals("0")){
			return "Arvtu "+x+" ruutjuur on "+ruutjuur;
		}else if (x<0){
			
			return "See ei ole okei number. ("+x+")";
		}else{
			
			return "Arvu "+x+" ruutjuur ei ole täpne arv.  ("+ruutjuur+")";
		}
	}
	
}