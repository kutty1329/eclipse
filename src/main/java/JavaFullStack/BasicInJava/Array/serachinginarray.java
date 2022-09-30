package JavaFullStack.BasicInJava.Array;

public class serachinginarray {
	public void searching(int[] value1)
	{
		System.out.println(value1.length);
		int number = 9;
		for (int pos=0;pos<value1.length;pos++)//syntex for searchingarray
		{
		if (value1[pos]==number)
		{
			System.out.println(number + "this number index is "+pos);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[] value = {1,2,3,4,5,6,7,8,9,};
		serachinginarray obj = new serachinginarray();
		obj.searching(value);
	}

}
