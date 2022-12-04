package MainProject;

public class AppMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Market user=new Market();
		Thread th=new Thread(user,"ManojKumar");
		Thread th1=new Thread(user,"Thivin");
		Thread th2=new Thread(user,"Thilak");
		Thread th3=new Thread(user,"Vishnu");
		Thread th4=new Thread(user,"Ganesh");
		Thread th5=new Thread(user,"Pradeep");
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();

	}

}
