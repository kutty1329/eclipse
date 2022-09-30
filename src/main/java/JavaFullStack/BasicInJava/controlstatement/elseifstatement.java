package JavaFullStack.BasicInJava.controlstatement;

public class elseifstatement {

	public static void main(String[] args) {
		// else if ---- more then condtion are check in line bye line
		//example first condtion false after next condtion apply in more then
		
		int a = 100;
		int b = 50;
		int c = 25;
		if(a<b)
		{
			System.out.println("THE CONDTION FALSE");
		}
		else if (b<c)
		{
			System.out.println("THE CONDTION ARE FALSE");
		}
		else if (a<c)
		{
			System.out.println("FALS STATMENT");
		}
		else if (!(b<c))
		{
			System.out.println("YES CORRECT ");
		}
		
		else 
		{
			System.out.println("THANK YOU");
		}

	}

}
