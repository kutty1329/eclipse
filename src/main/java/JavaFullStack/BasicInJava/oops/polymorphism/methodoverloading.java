package JavaFullStack.BasicInJava.oops.polymorphism;

public class methodoverloading {
	public void action(int a,int b)
	{
	  int c = a+b;
	  System.out.println(c);
	}
	public void action(int e,int f,int h)
	{
		int g = e+f+h;
		System.out.println(g);
	}
	public void action(float a , float b)
	{
	   float c = a+b;
	   System.out.println(c);
	}
	public void action()
	{
	  System.out.println("PRADEEP");	
	}

	public static void main(String[] args) {
		// polymorphism is a single action difrent behavioure
		// Its 2 methods are defined 
		//Method overloading and method overriding
		//compaile time(overloading) and runtime(overriding)
		//same class,same method name ,difrent perametore is called method overloading
		
		methodoverloading action = new methodoverloading();
		action.action(10,20);
		action.action(20,30,40);
		action.action(15.5f,25.5f);
        action.action();
		
	}

}
