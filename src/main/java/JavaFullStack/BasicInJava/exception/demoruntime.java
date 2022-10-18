package JavaFullStack.BasicInJava.exception;

import java.util.Scanner;

public class demoruntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String word = "I am Pradeep";
		
		try
		{
			System.out.println("please tell us the index number");
			System.out.println(word.charAt(scan.nextInt()));
		}
		catch(StringIndexOutOfBoundsException soe)
		{
			System.out.println("index number lessthen"+word.length());
			System.out.println(word.charAt(scan.nextInt()));
		}
		finally 
		{
			System.out.println("END");
		}

	}

}
