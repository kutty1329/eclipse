package JavaFullStack.BasicInJava;

import java.util.Scanner;

public class practise {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
//       System.out.println(sum);
//	}
//	
//	{
		
//  Scanner obj = new Scanner(System.in);
//  int num;
//  System.out.println("Enter the number");
//  num=obj.nextInt();
//  
//  System.out.println("The Multipule Number is" + num);
//  
//  for(int i =0;i<=10;i=i+2)
//  {
//	  System.out.println(num + " *" +  i +" =" +  num*i);
//  }
		Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 10; // To hold factorial
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
       
        for(int i=1; i<num; i++)
        {
            fact *= i;
        }
        
        System.out.println("Factorial: "+ fact);
}
}
