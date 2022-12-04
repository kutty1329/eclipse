package JavaFullStack.BasicInJava.oops.polymorphism;

public class methodoverriding extends subclass
{
	
	public void action(int a , int b) 
	{
		int c = a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// difrent class,same method name,same parametore is called method overriding
     
		methodoverriding obj = new methodoverriding();
		obj.action(10, 10);
		obj.action(20, 10);
		subclass obj1 = new  subclass();
		obj1.action(25, 35);
		// upcasting is a refrence by parent class obj creat by childclass 
		subclass obj2 = new methodoverriding();// upcasting
		obj2.action(40, 50);
	
	}


	
}
