import java.io.*;
import java.net.*;

public class InsertFunction implements Function{
	String aadress;
	String parameter1;
	String parameter2;
	String parameter3;
	public InsertFunction(String aadress, String parameter1, String parameter2, String parameter3){
		this.aadress = aadress;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
	}
	public String insert(String x, int y, String z){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(
				new URL(aadress + "?" + parameter1 + "=" + x + "&" + parameter2 + "=" + y + "&" + parameter3 + "=" + z).openConnection().getInputStream()));
				String line = reader.readLine();
				return line;
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return "Failed";
		
	}
	
	public String delete(String x){
		return "This method is not used in this function";
	}
}