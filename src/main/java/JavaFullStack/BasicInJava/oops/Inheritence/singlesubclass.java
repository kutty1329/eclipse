package JavaFullStack.BasicInJava.oops.Inheritence;

public class singlesubclass extends subclass2
{
	public void subclass2()
	{
	int age = 28;
	String name = "KUTTY";
	long mobno= 9003474223l;
	char init='N';
	double hight=5.6d;
	
	System.out.println(age);
	System.out.println(name);
	System.out.println(mobno);
	System.out.println(init);
	System.out.println(hight);
	
	}

public static void main(String[] args) {
	// This type  2 classes conected is called single inheritence
	singlesubclass obj=new singlesubclass();
	obj.subclass2();
	obj.sub();
	
	

}
}