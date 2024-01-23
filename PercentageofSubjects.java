package Skedar8;
import java.util.*;
public class PercentageofSubjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float rmt,epd,cc,miot,vlsi;
		float tot,avg,percen;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Marks obtained in RMT");
		rmt=sc.nextFloat();
		System.out.println("Enter The Marks obtained in EPD");
		epd=sc.nextFloat();
		System.out.println("Enter The Marks Obtained in CC");
		cc=sc.nextFloat();
		System.out.println("Enter The Marks Obtained in MIOT");
		miot=sc.nextFloat();
		System.out.println("Enter The Marks Obtained in VLSI");
		vlsi=sc.nextFloat();
		
		
		
tot=rmt+epd+cc+miot+vlsi;
System.out.println("The Total Marks is Obtained by Student is = "+tot);

avg=tot/5;
System.out.println("The Total Average Marks by Student is = "+avg);

percen=tot/500*100;
System.out.println("The Pecentage is Obtained by Student is = "+percen+"%");
			
		
	}

}
