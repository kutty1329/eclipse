package JavaFullStack.BasicInJava.oops;

public class multipleinheritence extends subclass
{
	public void mainclass()
	{
		String name = "THILAK";
		int age = 28;
		long mobno=1234567890l;
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(mobno);
	
	}


	public static void main(String[] args) {
		
      multipleinheritence obj = new multipleinheritence();
      obj.mainclass();
      obj.class2();
      obj.class3();
	}

}
