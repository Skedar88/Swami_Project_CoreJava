package Skedar8;

public class kkenumex {
	
	public enum days{
		Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5),Saturday(6),Sunday(7);
		
		private int value;
		private days(int value) {
		this.value=value;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(days d : days.values())
			System.out.println(d+" "+d.value);

	}

}
