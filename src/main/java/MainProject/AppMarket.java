package MainProject;

public class AppMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Market user=new Market();
		Thread th1=new Thread(user,"ManojKumar");
		th1.start();

	}

}
