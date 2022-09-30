package JavaFullStack.BasicInJava.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Projectarray 
{
	    
	public void task(String[]name)
	
	{
		
		System.out.println(name.length);
		name [0]="MANOJ";
		name [1]="ANNAMALAI";

		System.out.println("Change the values" + Arrays.toString(name));
	
	}
    public void task1(String[]name1)
    {
    	//System.out.println(name1.length);
    	
       Scanner scan = new Scanner(System.in);
       
       String name = scan.nextLine();
       
    	for(int pos=0;pos<name1.length;pos++)
    	{
    		if(name.equalsIgnoreCase(name1[pos]))
    		{
    		System.out.println(name + "the number is" + pos);
    		return;
    		}
    	}
    	System.out.println(name + "not found");
    	
    }
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		String[] myname={"PRADEEP","TWIN","THILAK","GANESH","ASWIN"};
		System.out.println(myname.length);
		Projectarray obj = new Projectarray();
		obj.task(myname);
		obj.task1(myname);

		
		
		
		
		
	
		

	}

}
