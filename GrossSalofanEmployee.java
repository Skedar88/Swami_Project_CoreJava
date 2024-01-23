package Skedar8;
import java.util.*;

public class GrossSalofanEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bs,bsal,w,with,d,depo,Grossal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		bs=sc.nextInt();
		System.out.println("Enter the Withdrawal Amount");
		w=sc.nextInt();
		System.out.println("Enter the deposite Amount");
		d=sc.nextInt();
		bsal=bs;
		with=bsal-w;
		depo=with+d;
		Grossal=depo;
		System.out.println("The Gross Salary for Employee is = "+Grossal);
		
	}

}
