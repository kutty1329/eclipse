package JavaFullStack.BasicInJava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class dailytaskarray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array =  {2,4,6,8,2,8,2,1,4,6,4};
		int [] array= {1,2,3,4,1,2,3,4,1,2,3,4};
		
		for(int i=0;i<array.length;i++)
		{
		 for(int j=i+1;j<array.length;j++)
			 
		if(array[i]==array[j])
				
		 {
			 System.out.print(array[i] +" ");
		 }
		
	    System.out.println();
		}
	}

}
