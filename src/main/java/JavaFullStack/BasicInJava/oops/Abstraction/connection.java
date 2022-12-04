package JavaFullStack.BasicInJava.oops.Abstraction;

public class connection extends operator
{

	public static void main(String[] args) {
		// Abstraction is pure 100% interface 
		// same as interface method 
		// use keyword abstract
		// use two methods no implemntion method and norml methods its called abstract
		
		connection obj = new connection();
		obj.calculate(10, 20);
		obj.types(25,25);
		obj.calculate(20, 30);
		obj.types(10, 10);

	}

	@Override
	public void calculate(int a, int b) {
	   int f= a*b;
	   System.out.println(f);
		
	}

	
	
	}


