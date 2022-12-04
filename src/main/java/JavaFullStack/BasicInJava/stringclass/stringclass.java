package JavaFullStack.BasicInJava.stringclass;

import java.util.Arrays;

public class stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String obj = "Kutty";// litteral
		String name = new String("PRADEEP");// non-litteral
		System.out.println(name);
		System.out.println(obj);
		name=name.concat("ISHU");
		System.out.println(name);/// Immutable by litteral in adding word
		obj=obj.concat("PRADEEP");
		System.out.println(obj);/// Immutable by liiteral in adding owrd
		System.out.println(name.charAt(5));// get the word by index
		System.out.println(name.equals(obj));
		String connect ="PradeepIshu";
		String connect1="pradeepishu";
		System.out.println(connect.compareTo(connect1));
	    System.out.println(connect.endsWith("h"));
	    System.out.println(name.replace("PRADEEP","PRADEEPISHU"));
	    String substr=name.substring(5);
	    System.out.println(substr);
	    System.out.println(substr.substring(1,5));
	    System.out.println(name.contains("MA"));
	    System.out.println(name.length());
	    String sentence ="   I AM A JAVADEVELPORE IN ZELOUS  ";
	    System.out.println(sentence);
	    sentence=sentence.trim();
	    System.out.println(sentence);
	    String sent="I AM A LOVERBOY. ";
	    System.out.println(sent);
	    String [] sent1=sent.split(" ");
	    for(String str:sent1)
	    {
	    System.out.println(str);
	    
	    }
	    
	}

}
