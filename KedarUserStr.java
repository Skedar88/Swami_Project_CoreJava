package Skedar8;
import java.util.*;
public class KedarUserStr {
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S1;
		String S2;
		System.out.println("Enter The String  S1");
		String s1= sc.nextLine();
		System.out.println("Enter The String  S2");
		String s2= sc.nextLine();
		
		
		System.out.println("S1 ="+s1);
		int length =s1.length();
		System.out.println("S1 length="+length);
		System.out.println("S1 lowercase="+s1.toLowerCase());
		System.out.println("S1 Uppercase="+s1.toUpperCase());
		System.out.println("S1 and S2 concate="+s1.concat(s2));

	}

}
