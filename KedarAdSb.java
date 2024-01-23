package Skedar8;
import java.util.*;
public class KedarAdSb {

	int a,b,sum,sub;
	
	KedarAdSb(){
		

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Value of a");
		
		a=sc.nextInt();
		
		System.out.println("Enter Value of b");
		
		b=sc.nextInt();
		
sum=a+b;
sub=a-b;
	}
	
	void display(){
		
		System.out.println("Sum is " +sum);
		System.out.println("Sub is " +sub);
	}
	
	class demo {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KedarAdSb kk =new KedarAdSb();
		kk.display();
	

	
}

}

