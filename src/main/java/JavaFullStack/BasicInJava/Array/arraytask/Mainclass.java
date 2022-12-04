package JavaFullStack.BasicInJava.Array.arraytask;

import java.util.Arrays;

public class Mainclass extends insertarray 
{
	
	public void sort(int[] value1)
	{
		for(int i=0;i<value1.length;i++)
		{
			for(int j=0;j<value1.length-i-1;j++)
			{
				if(value1[j]>value1[j+1])
				{
					int swap = value1[j];
					value1[j]=value1[j+1];
					value1[j+1]=swap;
					
				}
			}
		}
	}
	public int search(int[]value2,int low,int high, int key)
	{
		if(low<high)
		{
			int mid=(high+low)/2;
			if(value2[mid]==key)
				return mid;
			else if(value2[mid]>key)
				return search(value2,low,mid,key);
			else if(value2[mid]<key)
				return search(value2,low,high,mid);
		}
		
	return key;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mainclass obj = new Mainclass();
      obj.insert();
      int[] value = {12, 42, 112, 32, 22, 2, 62, 52, 92, 72};
      obj.sort(value);
      System.out.println("AFTER SORTING VALUE :"+ Arrays.toString(value));
      int key=52;
      System.out.println(key+"THIS NUMBER POSTION IS"+obj.search(value,0,value.length,key));
	}

}
