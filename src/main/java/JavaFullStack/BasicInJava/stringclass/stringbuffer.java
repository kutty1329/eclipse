package JavaFullStack.BasicInJava.stringclass;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff=new StringBuffer("Hello");
		buff.append("PRADEEP");
		System.out.println(buff);
		buff.insert(12,"AADHINI");
		System.out.println(buff);
		buff.replace(5, 12,"ANGEL");
		System.out.println(buff);
		buff.reverse();
		System.out.println(buff);
		buff.reverse();
		System.out.println(buff);
		buff.delete(6, 10);
		System.out.println(buff);

	}

}
