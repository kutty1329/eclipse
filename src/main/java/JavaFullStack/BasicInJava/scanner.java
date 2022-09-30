package JavaFullStack.BasicInJava;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
          
	Scanner obj = new Scanner(System.in);//SYTEX FOR SCANNER CLASS
	
	System.out.print("WHAT IS YOUR NAME :" + " ");
	String name = obj.nextLine();
	
	System.out.print("WHAT IS YOUR ADHARNUMBER NUMBER :" + " ");
	int number = obj.nextInt();
	
	System.out.print("WHAT IS YOUR DATE OF BIRTH :" + " ");
	int birth = obj.nextInt();
	
	System.out.print("WHAT IS YOUR MOBILENUMBER :" + " ");
	long mobile = obj.nextLong();
	
	
	System.out.println("WHAT IS YOUR ADRESS :" + " ");
	int my= obj.nextInt();
	}

}
