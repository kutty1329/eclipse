package JavaFullStack.BasicInJava.Collection;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class demolinkedlist {

	public static void main(String[] args) {
		// Genric method--------
		// not mention the variable 
		
		LinkedList list =  new LinkedList();
		
		list.add("WELCOME JAVA");/////add name in all variables
	    list.add('A');
	    list.addLast(7904201927L);
	    list.add("PRADEEP");
	    list.add(2,"N");
	    
	    System.out.println(list);   	    
	    list.set(0, "ZELZEHOUS ACCADAMY"); /// add (index,object)
	    
	    System.out.println(list);
	    System.out.println(list.getFirst());/// get the frst value 
	    System.out.println(list.getLast());/// get the last value 
	    System.out.println(list.getClass());
	    System.out.println(list.get(3)); // get the particular index value
//	    list.remove(2); /// remove the particular index
//	    list.removeFirst();  // remove the frst 
//	    list.removeLast(); //// remove the last
//	    list.remove(7904201927L); // remove the object
//	    System.out.println(list);
	    
	    java.util.Iterator i =list.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
//	    list.clear();  /// clear all
//	    System.out.println(list);
//	    System.out.println(list.contains(list)); // check the boolean 
	    /// Non - Genricmethod
	    /// mention the variable name use that variables are used
	    // Ex-- string name only used 
	    LinkedList<String> list1 = new LinkedList<String>();
	    
	    list1.add("Hi");
	    list1.addLast("THANKYOU");
	    list1.add(1,"WELCOME");
	    list1.add("HOW ARE YOU");
	   // System.out.println(list1);
//	    list1.clear();
//	    System.out.println(list1);
//	    System.out.println(list.contains(list1));
	    java.util.Iterator<String> obj = list1.iterator();
	    while(obj.hasNext())
	    {
	    	System.out.println(obj.next());
	    }
	}

}
