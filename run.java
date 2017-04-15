import java.util.Scanner;

public class run{
	
	public static void main(String[] args){
		Scanner operators = new Scanner(System.in);
		
		extension calcPercentage = new findPercentage();
		System.out.println("Insert first number: ");
		double x1 = operators.nextDouble();
		System.out.println("Insert second number: ");
		double y1 = operators.nextDouble();
		System.out.println(x1+ " is "+calcPercentage.calculate(x1,y1)+ "% of "+y1);
	}
}

/*
[joosjuha@greeny t07liides]$ java run
Insert first number:
33
Insert second number:
100
33.0 is 33.0% of 100.0
*/