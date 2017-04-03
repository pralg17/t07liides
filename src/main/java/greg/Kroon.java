package greg;

public class Kroon implements UusLiides{
	public double kr = 15.6;

	public String fn(double var){
		double kroonis = var * kr;
		String vastus = String.valueOf(kroonis);
		return vastus + " krooni";
	}
}