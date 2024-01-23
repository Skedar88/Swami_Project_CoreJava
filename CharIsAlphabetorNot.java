package Skedar8;
import java.util.*;
public class CharIsAlphabetorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The character");
		ch=sc.next().charAt(0);
		
		if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an alphabet.");
        else
            System.out.println(ch + " is not an alphabet.");

	}

}
