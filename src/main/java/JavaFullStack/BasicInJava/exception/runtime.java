package JavaFullStack.BasicInJava.exception;

import java.util.Scanner;

public class runtime {

	public static void main(String[] args) {
		// RUNTIME THEREAD EXCEPTION
		
		String inputword ="Hi there we are input word";
		Scanner scan = new Scanner(System.in);
		
		try //CONDTION BLOACK
		{
			System.out.println("please tell us the index number");
			System.out.println(inputword.charAt(scan.nextInt()));
		}
		catch (StringIndexOutOfBoundsException str)//EXCEPTION HANDLE BLOACK
		{
			System.out.println("index number shouid be lesthen"+inputword.length());//CONDTION THE LENGTH OF WORD
			System.out.println(inputword.charAt(scan.nextInt()));
		}
		finally
		{
			System.out.println("THANK YOU");
		}

	}

}
