package Skedar8;
import java.util.*;
public class GreatestNumAmongGivenThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num a=");
		a=sc.nextInt();
		System.out.println("Enter The Num b=");
		b=sc.nextInt();
		System.out.println("Enter The Num c=");
		c=sc.nextInt();
		
		if(a>=b && a>=c) {
			
			System.out.println("The num a is Largest Number");
		}
		else if(b>=a && b>=c) {
			
			System.out.println("The num b is Largest Number");
		}
		
		else {
			
			System.out.println("The num c is Largest Number");
		}
	}

}
