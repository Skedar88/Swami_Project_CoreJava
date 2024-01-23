package Skedar8;
import java.util.*;
public class AreaCircumference {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float r,aoc,coc;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value of r = ");
		r=sc.nextFloat();
		aoc=r*r;
		coc=r;
		
		System.out.println("Area of Circle is ="+aoc*3.14);
		System.out.println("Circumference of Circle is ="+coc*2*3.14);
		
	}   

}
