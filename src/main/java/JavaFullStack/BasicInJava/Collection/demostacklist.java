package JavaFullStack.BasicInJava.Collection;

import java.util.Stack;

public class demostacklist {

	public static void main(String[] args) {
		// stacklist its a genric method use all variables
		
		Stack list = new Stack();
		list.push("MAHAKAVIBHARATHI");// add the object use "PUSH"
		list.push("VAIRAMUTHU");
		list.push("KAMBAN");
		list.push("AR RAHMAN");
		list.push("VAALI");
		list.push("MUTHUKUMAR");
		System.out.println(list);
		list.pop();  /// delete the last elemnet use "POP"
		System.out.println(list);
		System.out.println(list.peek()); //// get the value top element use "PEEK"
		System.out.println(list.search("AR RAHMAN")); // search the object
		System.out.println(list.empty()); // check the true or false

	}

}
