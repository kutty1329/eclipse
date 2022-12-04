package JavaFullStack.BasicInJava.Constructor;

public class project {
	String Name ;
	int age ;
	long mobno;
	
	public project()
	{
		String Name="Thilak" ;
		int age=25 ;
		long mobno=9876865430l;
		System.out.println("my name is"+Name);
		System.out.println("my age is"+age);
		System.out.println("my mobno is"+mobno);
	}
	public project(String Name ,int age,long mobno)
	{
		this.Name=Name;
		this.age=age;
		this.mobno=mobno;
		System.out.println("my name"+" "+Name+" " +"my age" +" "+ age+" " + "mymob" + mobno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		project obj=new project();
		project obj1=new project("PRADEEP",28,7904201927l);
		project obj2=new project("Thivin",28,7904201927l);

	}

}



