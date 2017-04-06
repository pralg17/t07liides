import java.io.*;
import java.net.*;

public class Funktsioon implements Liides{
	String veebiaadress;
	String parameetrinimi;
	public Funktsioon(String veebiaadress, String parameetrinimi){
		this.veebiaadress = veebiaadress;
		this.parameetrinimi = parameetrinimi;
	}
	
	public int f(int x){
		try{
			BufferedReader lugeja = new BufferedReader(new InputStreamReader(
			new URL(veebiaadress+"?"+parameetrinimi+"="+x).openConnection().getInputStream()));
			
			String rida = lugeja.readLine();
			return Integer.parseInt(rida);
		}catch(Exception ex){System.out.println(ex.getMessage());}
		return -1;
	}
}