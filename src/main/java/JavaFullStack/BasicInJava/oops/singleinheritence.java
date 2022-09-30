package JavaFullStack.BasicInJava.oops;

public class singleinheritence extends subclass
{
	public void mainclass()
	{
		String name = "PRADEEP";
		int age = 27;
		long mobno=7904201927l;
		char initial='N';
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(mobno);
		System.out.println(initial);
	}

	public static void main(String[] args) {
		
		singleinheritence obj = new singleinheritence();
		obj.mainclass();
		obj.class2();

	}

}
