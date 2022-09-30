package JavaFullStack.BasicInJava.Array;

public class jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] jaggedarray=new int[5][0];
        jaggedarray[1]=new int[1];
        jaggedarray[2]=new int [2];
        jaggedarray[3]=new int [3];
        int count =0;
        //value assumption
        for(int column=0;column<jaggedarray.length;column++)
        {
        	for(int row=0;row<jaggedarray[column].length;row++)
        	{
        		jaggedarray[column][row]=count+=1;
        	}
        }
        //print the value
        for(int column=0;column<jaggedarray.length;column++)
        {
        	for(int row=0;row<jaggedarray[column].length;row++)
        	{
        		System.out.print(jaggedarray[column][row]+" ");
        	}
        	System.out.println();
        }
	}

}
