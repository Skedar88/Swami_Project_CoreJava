package Skedar8;
import java.util.*;
public class StaticKedar {

	int rol;
	String name;
	static String clg= "SBPCOE";
	
	StaticKedar(int x, String y) {
		
		rol=x;
		name=y;
	}
	
	void display() {
		
		System.out.println("College Name is-" +clg);
		System.out.println("Student Name is-" +name);
		System.out.println("Roll No. is-"+rol);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticKedar kk =new StaticKedar(8,"Kedar");
		StaticKedar kk2 =new StaticKedar(29,"Pavan");
		StaticKedar kk3 =new StaticKedar(6,"Shashi");
		kk.display();
		kk2.display();
		kk3.display();
	}

}
