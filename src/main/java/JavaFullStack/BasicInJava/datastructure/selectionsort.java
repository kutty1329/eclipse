package JavaFullStack.BasicInJava.datastructure;

import java.util.Arrays;

public class selectionsort {
	public void sortingarray(int [] array1)
	{
	 System.out.println("BEFORE SORTING VALUES :" + Arrays.toString(array1));
	 for(int i=0;i<array1.length;i++)
	 {
		for(int j=0;j<array1.length;j++) 
		{
			if(array1[i]<array1[j])
			{
				array1[i]^=array1[j];
				array1[j]^=array1[i];
				array1[i]^=array1[j];
			}
		}
	 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {55,41,23,67,80,20,1,};
		selectionsort obj = new selectionsort();
		obj.sortingarray(array);
       // for(int arr1:array)
        {
        	System.out.println("AFTER UPDATING SORTING VALUES : "+Arrays.toString(array));
        }
	}

}
