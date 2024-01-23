package Skedar8;

public class enumKedar {
	
public enum month {
		
		JAN(1),FEB(2),MAR(3);
		private int value;
		private month(int value) {
			this.value=value;
		} }
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	for(month m :month.values())
		System.out.println(m+" "+m.value);
		

	}

}
