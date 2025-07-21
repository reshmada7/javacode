package ArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of an array");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" Enter values of array at position "+i);
			a[i]=sc.nextInt();
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
