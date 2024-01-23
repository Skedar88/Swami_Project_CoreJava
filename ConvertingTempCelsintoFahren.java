package Skedar8;
import java.util.*;
public class ConvertingTempCelsintoFahren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float cels,fahren;
		float Celsius,Fahrenait;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Celsius Value");
		cels=sc.nextFloat();
		
		Celsius=cels;
		System.out.println("Celsius is ="+Celsius);
		
		Fahrenait=((Celsius*9)/5)+32;
		System.out.println("Fahrenait is ="+Fahrenait);
		
	
	}

}
