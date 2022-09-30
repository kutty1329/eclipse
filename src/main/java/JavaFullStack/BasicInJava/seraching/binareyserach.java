package JavaFullStack.BasicInJava.seraching;

import java.util.Arrays;

public class binareyserach {
	public int binary(int[] array1,int low,int high,int key )
	{
     if(low<high)
     {
    	 int mid = (high+low)/2;
    	 if(array1[mid]==key)
    	 
    		 return mid;
    	 
    		 else if (array1[mid]>key)
    			 return binary(array1,low,mid,key);
    	 
    		 else if(array1[mid]<key)
    			 return binary(array1,mid+1,high,key);  	 
     }
		
		return -1;
	}
      
	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		int key = 90;
		binareyserach obj = new binareyserach();
		//obj.binary(array,0,array.length,key);
		System.out.println(key+ "THIS NUMBER IS POSTION "+obj.binary(array,0,array.length,key));

	}

}
