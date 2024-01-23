package Skedar8;

public class Overr {
	
	void show (String x, int y) {
		System.out.println("Its String and int");
	}
	
	void show (int x , String y) {
		System.out.println("Its int and String");
		System.out.println();
	}
	


// 
	
	void show (double x, int y) {
		System.out.println("Its double and int");
	}
	
	void show (int x , double y) {
		System.out.println("Its int and double");
	}
	
//	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Overr oo = new Overr();
	oo.show("Ram",12);
	oo.show(88,"Kedar");
	oo.show(1.2,12);
	oo.show(8,0.8);

	}

}
