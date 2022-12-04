package JavaFullStack.BasicInJava.oops.Encapsulation;

public class connected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employdetail obj = new employdetail();
		employdetail obj1 = new employdetail();
		obj.setEmpname("PRADEEP");
		obj.setEmpid(1001);
		obj.setEmpsalry(35000);
		obj1.setEmpname("TIWIN");
		obj1.setEmpid(1002);
		obj1.setEmpsalry(25000);
		
		System.out.println(obj.getEmpname());
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmpsalry());
		System.out.println(obj1.getEmpname());
		System.out.println(obj1.getEmpid());
		System.out.println(obj1.getEmpsalry());

	}

}
