package JavaFullStack.BasicInJava.stringclass;

public class stringbuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff=new StringBuffer("HI");
		buff.append("PRADEEP");
		System.out.println(buff);
		buff.insert(2, "DEAR");
		System.out.println(buff);
		buff.replace(6, 13, "AADHINI");
		System.out.println(buff);
		buff.reverse();
		System.out.println(buff);
		buff.reverse();
		System.out.println(buff);
		buff.delete(0, 2);
		System.out.println(buff);
		

	}

}
