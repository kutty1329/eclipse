package JavaFullStack.BasicInJava.oops.Encapsulation;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personaldetail obj = new personaldetail();
		obj.setname("KUTTY");
		obj.setage(28);
		obj.sethight(5.6f);
		obj.setmobno(7904201927L);
		obj.setmybool(true);
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		System.out.println(obj.gethight());
		System.out.println(obj.getmobno());
		System.out.println(obj.getmybool());

	}

}
