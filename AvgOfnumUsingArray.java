package Skedar8;
import java.util.*;
public class AvgOfnumUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double[] arr= {1,2,3,4,6,7,8,9};
double length= arr.length;
double sum = 0;
for (double d=0;d<arr.length;d++) {
	
	sum += arr[(int) d];
}
 double average = sum / length;
System.out.println("The Average of an Array is "+average);
	}
	}