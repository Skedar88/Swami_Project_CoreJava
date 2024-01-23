package Skedar8;

public class WrappertoPrimitive {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer myInt=5;
		Double myDouble = 5.88;
		Character myChar ='S';
		
		int x=myInt.intValue();
		System.out.println(x);
		
		double y=myDouble.doubleValue();
		System.out.println(y);
		
		char z=myChar.charValue();
		System.out.println(z);
		System.out.println();
		
//		Autoboxing 
		
//		Primitive to Wrapper
		
		int num =10;
		Integer obj = Integer.valueOf(num);
		
//		creating wrapper class object
		
		
		System.out.println(num+" "+obj);
		
		

	}

}
