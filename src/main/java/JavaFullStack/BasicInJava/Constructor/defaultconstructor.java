package JavaFullStack.BasicInJava.Constructor;

public class defaultconstructor 
{
	String name;
	 int age;
	 long mobno;
	 double salry;
	 float hight;
	 char initial;
	 boolean mybool;
	 
	 int age1 = 25;
	 String name1="KUTTY";
	 
	 public defaultconstructor(String name,int age,long mobno,double salry,float hight,boolean mybool)
	 {
		 this.name = name;
		 this.age=age;
		 this.hight=hight;
		 this.mobno=mobno;
		 this.salry=salry;
		// this.initial=string;
		 this.mybool=mybool;
		 
		 System.out.print("MY NAME :" +name + " "+"MY HIGHT :"+ hight+" " + "MY AGE :"+ age+ " " + "MY MOBNO : " + mobno+ " " + "MY SALARY :" + salry+" " + " THIS RECORDS ARE : " + mybool+ " ");
		 System.out.println();
	 }

	

	public static void main(String[] args) {
		// Constructor is super method
		// class name and constructor or object name is same is called constructor
		// 2 types ( default constructor and parametore constructor)
		
		 
		 
		// PARAMEETER CONSTRUCTOR(arguments pass object)
		defaultconstructor obj1 = new defaultconstructor("PRADEEP", 28, 7904201927L, 25000, 5.6f, true);
		defaultconstructor obj2 = new defaultconstructor("TIWIN", 24, 1234567890L, 28000, 5.4f, true);
		defaultconstructor obj3 = new defaultconstructor("THILAK", 25, 9876543210L, 26000, 5.8f, true);
	}

	

	

}
