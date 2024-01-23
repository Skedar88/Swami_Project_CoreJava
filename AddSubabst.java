package Skedar8;
abstract class Kedar{
	
	 abstract public void displ();
}
class AddSubabst extends Kedar{
	public void displ() {
		System.out.println("Addition and Substraction");
	}
	
	int a=5,b=5,sum,sub;
	
	public void add() {
		sum=a+b;
		System.out.println("Sum is= "+sum);
	}
	public void Substract() {
		sub=a-b;
		System.out.println("Sub is= "+sub);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AddSubabst obj = new AddSubabst();
		obj.displ();
		obj.add();
		obj.Substract();
		

	}

}
