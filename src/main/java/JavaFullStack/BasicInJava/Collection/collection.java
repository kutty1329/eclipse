package JavaFullStack.BasicInJava.Collection;

import java.util.LinkedList;

public class collection {

	public static void main(String[] args) {
      
		LinkedList list = new LinkedList();
		
		list.add("PRADEEP");
		list.add('N');
		list.addLast(7904201927L);
		list.addFirst("THE COLLECTION TOPIC ");
		list.add(4,"JAVA");//INDEX for adding in postion
		list.addLast(list);
		
		System.out.println(list);
		System.out.println(list.contains("PRADEEP"));// check the value true or false
		list.add(0,"KUTTY");//Index for new value adding
		list.set(6,"JAVA1");//Index for upadting
		System.out.println(list);
		list.clear();//Index for clear values
		System.out.println(list);
	}

}
