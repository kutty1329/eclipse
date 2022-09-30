package JavaFullStack.BasicInJava.datastructure;

import java.util.Arrays;

public class selectionsorting1 {
	public void sorting(int[] value1)
	{
		for(int i=0;i<value1.length;i++)
		{
			for(int j=0;j<value1.length;j++)
			{
				if(value1[i]>value1[j])//syntex for selection
				{
					value1[i]^=value1[j];//syntex for selction keyword
					value1[j]^=value1[i];
					value1[i]^=value1[j];           
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] value = {125,35,55,105,95,5,10,55,65};
		System.out.println("BEFORE SORTING VALUES :" + Arrays.toString(value));
		selectionsorting1 obj = new selectionsorting1();
		obj.sorting(value);
		System.out.println("AFTER SORTING VALUES :" + Arrays.toString(value));

	}

}
