package JavaFullStack.BasicInJava.seraching;

import java.util.Arrays;

public class dailytask3 {
	public void sorting(int []array1)
	{
		for(int i =0;i<array1.length;i++)
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
	public int sorting1(int[]array2,int low,int high,int key)
	{
	  if(low<high)
	  {
		   int mid=(high+low)/2;
		   if(array2[mid]==key)
			   return mid;
		   else if(array2[mid]>key)
			   return sorting1(array2,low,mid,key);
		   else if(array2[mid]<key)
			   return sorting1(array2,mid+1,high,key);
		   
		   
		   
	   }
		return key;
	}

	public static void main(String[] args) {
		int [] array= {125,350,450,25,5,6,7,111,};
		int  key = 25;
		dailytask3 obj=new dailytask3();
		obj.sorting(array);
		System.out.println("UPDATING VALUE SORTING"+Arrays.toString(array));
        System.out.println("FINAL VALUES BINARYSERACHING :"+obj.sorting1(array, 0, array.length, key));
	}

}
