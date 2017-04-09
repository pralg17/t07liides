import java.util.*;
public class Usage{

	public static String calculate(Function fn, double number){
		return fn.f(number);
	}

	
	public static void main(String[] arg){
		SqrtFunction sqrtCalculate=new SqrtFunction();
		System.out.println(calculate(sqrtCalculate, 100));
		System.out.println(calculate(sqrtCalculate, 200));
		System.out.println(calculate(sqrtCalculate, 300));
		System.out.println(calculate(sqrtCalculate, -150));
		System.out.println(calculate(sqrtCalculate, 11));
		System.out.println(calculate(sqrtCalculate, 1));

	}
}