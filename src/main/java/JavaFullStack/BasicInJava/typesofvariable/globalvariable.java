package JavaFullStack.BasicInJava.typesofvariable;

public class globalvariable 
{
       static int battry = 5000;// static variable  
      int a = 10;
      int c=20;
  	  int d=a+c;
       public void main()
     
       {
      	 int varanty= 15;//localvariable
      	 System.out.println(varanty);
      	 System.out.println(battry);
      	 System.out.println(a);
      	 System.out.println(c);
      	 System.out.println(d);
       }
	public static void main(String[] args) {
		// global variable
		String productname = "MOBILE";
	       int price = 10000;
	       float size = 5.5f;
	       long imino= 1234567890l;
          System.out.println(productname);
          System.out.println(price);
          System.out.println(size);
          System.out.println(battry);
          System.out.println(imino);
       globalvariable scan = new globalvariable();
       scan.main();
	}
	
}
