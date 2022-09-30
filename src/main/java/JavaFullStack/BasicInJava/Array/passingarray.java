package JavaFullStack.BasicInJava.Array;

import java.util.Arrays;

public class passingarray {
	public void seraching(double[]numbers1)
	{
		System.out.println(numbers1.length);//check length value
		numbers1[0]=1;//syntex for change value in position
		numbers1[1]=2;
		numbers1[2]=3;
		numbers1[3]=4;
		//syntex for change the value in print
		System.out.println("Change the values" + Arrays.toString(numbers1));
		
	}
	public void seraching(int[]numbers2)
	{
		System.out.println(numbers2.length);//check length value
		numbers2[0]=4;//syntex for change value in position
		numbers2[1]=6;
		numbers2[2]=8;
		numbers2[3]=10;
		//syntex for change the value in print
		System.out.println("Change the values" + Arrays.toString(numbers2));
		
	}
	


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		double[] number = {10.5,11.5,12.5,13.5,14.5,15.5};
		int[]number1= {11,12,13,14,15,16,};
		//syntex for passingarrays
		System.out.println("Before values" + Arrays.toString(number));
		passingarray obj = new passingarray();
		obj.seraching(number);
		obj.seraching(number1);
	}

}
