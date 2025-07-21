package ArrayExamples;

import java.util.Arrays;

public class EvenAndOddNumbersInArray {
	
	public static void main(String[] args) {
		
		int a[]= new int[3];
		
		a[0]=10;
		a[1]=33;
		a[2]=44;
		
		for(int i=0;i<a.length;i++)
		{
		
			System.out.println(" Number in Array: " +a[i]);
			
			
			if(a[i]%2==0)
			{
				System.out.println("Number is Even");
			}
			
			else
			{
				System.out.println("Number is odd");
			}
		}
	}

}
