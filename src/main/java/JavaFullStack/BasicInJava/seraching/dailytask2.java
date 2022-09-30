package JavaFullStack.BasicInJava.seraching;

import java.util.Arrays;

public class dailytask2 {
	public void sorting(float[]array1) {
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length-i-1;j++)
			{
				if(array1[j]>array1[j+1])
				{
				 float swap = array1[j];
				 array1[j]=array1[j+1];
				 array1[j+1]=swap;
					
				}
			}
		}
	}
   public int sorting1(float[] array2,float low,float high,float key)
   {
	  if(low<high)
		  
	  {
		 float mid=(high+low) /2;
		 if(array2[mid]==key)
			 return mid;
		 else if(array2[mid]>key)
			 return sorting1(array2,low,mid,key);
		 
		 else if(array2[mid]<key)
			 return sorting1(array2,mid+1,high,key);
		 
	  }
	   
	   return -1;
   }
	public static void main(String[] args) 
	    {
		//The operator ^= is undefined for the argument type(s) float, float
		float[] array = {25.5f,45.5f,75.5f,90.5f,15.5f,115.5f};
		float key = 75.5f;
		dailytask2 obj = new dailytask2();
		obj.sorting(array);
		System.out.println("UPDATING SORTING VALUES :"+Arrays.toString(array));
        System.out.println(key +"this value is postion : "+(obj.sorting1(array,0,array.length,key)));
	}

}
