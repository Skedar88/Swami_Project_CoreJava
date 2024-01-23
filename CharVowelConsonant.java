package Skedar8;
import java.util.*;
public class CharVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Character");
		ch=sc.next().charAt(0);
		 

        if(ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' || ch == 'u' ) {
        	
        	 System.out.println(ch + " is vowel");
        }
        	
        
        
        else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        	
            System.out.println(ch + " is vowel");
        }
        else { 
        	System.out.println(ch + " is consonant");
        }

	}  
}
