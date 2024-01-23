package Skedar8;
abstract class animal{
	public abstract void sound();
}
public class Abstract extends animal{
	

	public void sound()
	{
		System.out.println("Wooof");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal obj =new Abstract();
		obj.sound();

	}

}
