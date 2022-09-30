package JavaFullStack.BasicInJava.datastructure;

import java.util.Arrays;

public class bubblesort {
	public void sorting(double[] array1)
	{
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length-i-1;j++)
			{
				if(array1[j]>array1[j+1])
				{
					double swap = array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=swap;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = {10,89,78,48,56,98,54,33,68};
		System.out.println("BEFORE SORTING VALUES :" + Arrays.toString(array));
       bubblesort obj = new bubblesort();
       obj.sorting(array);
       System.out.println("AFTER SORTING VALUES :" + Arrays.toString(array));
	}

}
