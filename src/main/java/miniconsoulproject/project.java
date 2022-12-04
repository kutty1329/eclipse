package miniconsoulproject;

import java.lang.reflect.Array;
import java.util.Arrays;

public class project {
	public void sorting(int[]array1) 
	{
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
	 public int searching(int[]array2,int low,int high,int key)
	 {
		 
		if(low<high) 
		{
			int mid=(high+low)/2;
			
			if(array2[mid]==key)
				
				return mid;
			
			else if(array2[mid]>key)
				return searching(array2,low,mid,key);
			
			else if(array2[mid]<key)
				return searching(array2,mid+1,high,key);
		}		 	 
		 return 0;
	 }
	 public static int values(int[] array3)
	 {
		int count=0;
		int count1=10;
		for(int i=0;i<array3.length;i++)
		{
			if(array3[i]>count)
				count=array3[i];
		
		if(array3[i]<count1)
				count1=array3[i];  
		
		}
		System.out.println(count + count1);
		 return count + count1;
	 

	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,5,89,300,450,78,45,250,35,60};
		int key = 45;
		project obj = new project ();
		obj.values(array);
		obj.sorting(array);
		System.out.println(Arrays.toString(array));
		System.out.println(key+" " +"This postion IS"+ " "+obj.searching(array,0,array.length, key));
        
        
	}

}
