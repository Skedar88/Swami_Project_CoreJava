package Skedar8;
import java.util.*;

public class PrintAsciiValueCharacter {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char str1,str2;
int ascii1,ascii2;

Scanner sc = new Scanner(System.in);
System.out.println("Enter The Character1 ");
str1=sc.next().charAt(0);
System.out.println("Enter The Character2 ");
str2=sc.next().charAt(0);
ascii1=str1;
ascii2=str2;
System.out.println("Ascii value of char 1 is"+ascii1);
System.out.println("Ascii value of char 2 is"+ascii2);
	}

}
