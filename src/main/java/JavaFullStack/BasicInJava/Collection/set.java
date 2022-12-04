package JavaFullStack.BasicInJava.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		// its 2 types
		// Hashset and tree set
		//set is a duplicate values are not allowed
		// list is a duplicate values are not allowed
		
		HashSet obj = new HashSet();
		obj.add("HI");
		obj.add("HELLO");
		obj.add("HI");
		obj.add("WELCOME");
		System.out.println(obj);
		
		TreeSet obj1 = new TreeSet();
		obj1.addAll(obj);
		obj1.add("JAVA");
		System.out.println(obj1);

	}

}
