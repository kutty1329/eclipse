package JavaFullStack.BasicInJava.Collection;

import java.util.ArrayList;
import java.util.Vector;

public class arraylistvectorlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj = new ArrayList();
		obj.add("HAI");/// add values
		obj.add(790);
		obj.add(1234567891L);
		obj.add(5.6f);
		obj.add(false);
		System.out.println("Arraylist values"+obj);
	   // obj.set(3, "welcome");// update or replace the values
		//System.out.println(obj);
		//obj.remove(1);//remove the intex
		//System.out.println(obj);
		//System.out.println(obj.get(2));//get the values 
      Vector obj1 = new Vector();
       obj1.add("HAI");/// add values
		obj1.add(790);
		obj1.add(1234567891L);
		obj1.add(5.7f);
		obj1.add(false);
		System.out.println("vector values"+obj1);
		 obj1.removeAll(obj);// remove all original values
	     System.out.println("Remove original values"+obj1);
       obj.retainAll(obj1);
      System.out.println("Retained values "+ obj1);
       
        
	}

}
