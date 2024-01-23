package Skedar8;
import java.util.*;
public class PrimewithPara {

	int num,i,flag=0;
	
	PrimewithPara (int x){
		
		num=x;
		
	}
	
	void calculate() {
		
		for (i=2;i<=num/2;i++)
		{
			
			if (num%i==0) 
			{
				flag=1;
				
				break;
					
			}
			
		}
		
		
		if (flag==0)
		{		
			System.out.println("It is a Prime Number");
		}
		
		else {
			System.out.println("It is not a Prime Number");
		}
		
	}
	
	void display() {
		
		System.out.println("Number is =" +num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		x=sc.nextInt();
		
		PrimewithPara kk = new PrimewithPara(x);
		kk.calculate();
		kk.display();
		
	}

}
 