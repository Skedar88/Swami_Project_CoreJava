package Skedar8;

 class KKkedar {

void cal(int a,int b) {
	int sum;
	sum=a+b;

		System.out.println("Addition is = " +sum);
		System.out.println();
		
	}
}
	 class OverrideAddSub extends KKkedar {
		
		void cal(double x , double y) {
			double sub;
			sub=x-y;
			System.out.println("Substraction is = " +sub);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverrideAddSub rr=new OverrideAddSub ();
		rr.cal(3,3);
		rr.cal(3.3,2.3);
		
	}

}
