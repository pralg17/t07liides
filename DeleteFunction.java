import java.io.*;
import java.net.*;

public class DeleteFunction implements Function{
	String aadress;
	String parameter;
	public DeleteFunction(String aadress, String parameter){
		this.aadress = aadress;
		this.parameter = parameter;
	}
	public String delete(String x){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(
				new URL(aadress + "?" + parameter + "=" + x).openConnection().getInputStream()));
				String line = reader.readLine();
				return line;
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return "Failed to delete something";
		
	}
	
	public String insert(String x, int y, String z){
		return "This method was not used in this function";
	}
	
}