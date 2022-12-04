package JavaFullStack.BasicInJava;

public class looping {

	public static void main(String[] args) {
		// for looping,while looping,do while loop
		// while loop is called entery loop-- condtion is applied frst
		// do while is called exit loop----output is coming true or false 
		// but when condtion is applied come output
      
		//{initiating;condtion;increament or decrement}----syntex for looping
		for (int i=1;i<=5;i++)
		{
			System.out.println("JAVA");
		}
		int pos = 0;
		while(pos<=4)
		{
			System.out.println("WELCOME JAVA");
			pos++;
		}
		int i=0;
		do
		{
			System.out.println("WELCOME THE JAVA FULLSTRACK");
		    i++;
		}
		while(i<=2);
	}

}
