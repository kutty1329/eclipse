package JavaFullStack.BasicInJava.controlstatement;

public class Nestedifstatement {

	public static void main(String[] args) {
		// check the value more then time 
		// but frst loop fals not check the other loopvalue then get the else condtion 
      
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		if((a<b)||(b<a))
		{
			if(a==b)
			{
				System.out.println("SAY HI");
			}
			if (d<a)
			{
				System.out.println("SAY HELLO");
			}
			if(c<a)
			{
				System.out.println("SAY WHO ARE YOU");
			}
			if((a<b)&(b<c))
			{
				System.out.println("HAI I AM THERE THIS VALUE IS CORRECT");
			}
			else 
			{
				System.out.println("THANK YOU");
			}
			
			}
		else 
		{
			System.out.println("GET OUT");
		}
	}

}
