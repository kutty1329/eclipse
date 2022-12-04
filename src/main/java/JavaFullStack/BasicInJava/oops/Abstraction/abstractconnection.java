package JavaFullStack.BasicInJava.oops.Abstraction;

public class abstractconnection extends sample
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abstractconnection obj = new abstractconnection();
		obj.test(5, 2);
		obj.test1(10, 10);
		obj.test(2, 1);
		obj.test1(5, 2);

	}

	@Override
	public void test(int a, int b) {
		// TODO Auto-generated method stub
		int o = a*b;
		System.out.println(o);
	}

	@Override
	public void test1(int c, int d) {
		// TODO Auto-generated method stub
		super.test1(c, d);
		int h = c-d;
		System.out.println(h);
	}

}
