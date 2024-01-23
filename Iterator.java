package Skedar8;
import java.util.*;
public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aa= new ArrayList();
		aa.add("Skedar");
		aa.add("SPavan");
		aa.add("HShashi");
System.out.println(aa);

Iterator i=(Iterator) aa.iterator();
while(i.hasNext())
{
	System.out.println(i.hasNext());
}
		
	}

	private boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

}
