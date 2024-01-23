package Skedar8;
import java.util.*;

public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float b,h,aot;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value of Bridght");
		b=sc.nextInt();
		System.out.println("Enter The Value Of Height");
		h=sc.nextInt();
		aot=b*h/2;
		System.out.println("The Area Of Triangle is "+aot);
		
	}

}
