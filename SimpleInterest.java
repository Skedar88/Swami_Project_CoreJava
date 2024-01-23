package Skedar8;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,r,t,si;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of Principle");
		p=sc.nextInt();
		System.out.println("Enter The Value Of Rate");
		r=sc.nextInt();
		System.out.println("Enter The Value Of Time");
		t=sc.nextInt();
		si=p*r*t;
		System.out.println("Simple Interest is = "+si);
	}

}
