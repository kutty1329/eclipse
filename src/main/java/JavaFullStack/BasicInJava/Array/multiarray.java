package JavaFullStack.BasicInJava.Array;

public class multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arrae = {{1,2,3},{4,5,6,},{7,8,9,}};
		String[][] arrae1= {{"HI","HELLO","HOW"},{"WHO","ARE","YOU"}};
		for(int i=0;i<3;i++)//////////column 
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arrae[i][j]+" ");///////row
			}
			System.out.println();
		}
             
	
	for(int i=0;i<2;i++)//////////column 
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arrae1[i][j]+" ");///////row
		}
		System.out.println();
	}
         
}

}
