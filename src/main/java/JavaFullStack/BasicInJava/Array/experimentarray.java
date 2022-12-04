package JavaFullStack.BasicInJava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class experimentarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] a = new int[10];
       a[0] = 1;
       a[1] = 2;
       a[2] = 3;
       a[3] = 4;
       a[4] = 5;
       a[5] = 6;
       a[6] = 7;
       a[7] = 8;
       a[8] = 9;
       a[9] = 10;
       
       for(int pos=0;pos<a.length;pos++)
         {
      	   System.out.println(a[pos]);
         }
    	   System.out.println(Arrays.toString(a));
       
      
	}

}
