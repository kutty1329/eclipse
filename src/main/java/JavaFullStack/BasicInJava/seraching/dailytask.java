package JavaFullStack.BasicInJava.seraching;

import java.util.Arrays;

public class dailytask 
{
	public void seraching(int[]value1)
	{
		for(int i=0;i<value1.length;i++)
		{
			for(int j=0;j<value1.length;j++)
			{
			  if(value1[i]<value1[j])
			  {
				  value1[i]^=value1[j];
				  value1[j]^=value1[i];
				  value1[i]^=value1[j];
				  
			  }
			}
		}
		
	}
	public int seraching1(int[] value1,int low,int high,int key)
	{
	 if(low<high)
	 {
		 int mid =(high+low)/2;
		 if(value1[mid]==key)
			 return mid;
		 
		 else if(value1[mid]>key)
			 return seraching1(value1,low,mid,key);
		 
			 else if(value1[mid]<key)
				 return seraching1(value1,mid+1,high,key);
	 }		
		return -1;
	}

	public static void main(String[] args) {
		
		int[] value = {25,10,35,90,45,75,5,100,65,1};
		int key = 75;
		dailytask obj = new dailytask();
		obj.seraching(value);
		obj.seraching1(value,0,value.length,key);
		
		System.out.println("UPDATING SORTING VALUES"+Arrays.toString(value));
		System.out.println("AFTER SORTING BINARY VALUES : " + obj.seraching1(value, 0, value.length, key));

	}

}
