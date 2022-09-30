package JavaFullStack.BasicInJava.controlstatement;

import java.util.Scanner;

public class ifelsestatement {

	public static void main(String[] args) {
//if staement are condtion true get the output 
//condtion false output come but statement are esle statement(that mean error found)
		
      int a = 100;
      int b = 50;
      
      if(!(a<b))
      {
    	 
    	  System.out.println("THE CONDTION ARE TRUE");
    	   
      }
      else
    	  System.out.println("ERROR");
      
      if((a<b)||(b<a))
      {
    	  System.out.println("THE CONDTION TRUE SAY HI");
      }
      else
      {
    	  System.out.println("THANK YOU");
      }
	}

}
