package JavaFullStack.BasicInJava.stringclass;

public class stringclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =" KUtty ";
		System.out.println(name);
		name=name.concat("ISHU");
		System.out.println(name);
        System.out.println(name.charAt(7));
        String obj="AADHINI";
        System.out.println(name.equals(obj));
        String obj1="aadhini";
        System.out.println(obj.compareTo(obj1));
        System.out.println(obj.endsWith("I"));
        System.out.println(obj.replace("AADHINI", "AADHINIANGEL"));
        String substr=obj.substring(2);
        System.out.println(substr);
        System.out.println(substr.subSequence(1, 3));
        System.out.println(obj.contains("IN"));
        System.out.println(obj.length());
        name=name.trim();
        System.out.println(name);
        String [] name1=name.split(" ");
        for(String nme:name1)
        {
        	System.out.println(nme);
        }
        
	}

}
