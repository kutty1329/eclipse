package JavaFullStack.BasicInJava.datastructure;

import java.util.Arrays;

public class bublesort1 {
	public void sorting(int[]value1 )
	{
		for(int i =0;i<value1.length;i++)
		{
			for(int j=0;j<value1.length-i-1;j++)
			{
				if(value1[j]<value1[j+1])
				{
					int swap = value1[j];
					value1[j]=value1[j+1];
					value1[j+1]=swap;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] value = {73,62,27,44,11,24,71,51,22};
		System.out.println("BEFORE SORTING VALUE :"+ Arrays.toString(value));
		bublesort1 obj = new bublesort1();
		obj.sorting(value);
		System.out.println("AFTER SORTING VALUE :" + Arrays.toString(value));

	}

}
