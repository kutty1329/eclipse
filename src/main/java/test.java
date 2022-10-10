import java.util.Arrays;

public class test {
	public  void sort(int[] array1)
	{
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length-i-1;j++)
			{
				if(array1[j]>array1[j+1])
				{
					int swap = array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=swap;
				}
			}
		}
	}
	public void sort1(int[] array4)
	{
		for(int i=0;i<array4.length;i++)
		{
			for(int j=0;j<array4.length;j++)
			{
				if(array4[i]>array4[j])
				{
					array4[i]^= array4[j];
					array4[j]^=array4[i];
					array4[i]^=array4[j];
					
				}
			}
		}
	}
	public int search(int[] array2,int low,int high,int key)
	{
		if(low<high)
		{
			int mid=(high+low)/2;
			if(array2[mid]==key)
				return mid;
			else if (array2[mid]>key)
				return search(array2,low,mid,key);
			else if (array2[mid]<key)
				return search (array2,low,high,mid);
		}
		return key;
	}
	public void search1(int[] array3)
	{
		int number=5;
		for(int i=0;i<array3.length;i++)
		{
			if(array3[i]==number)
			{
				System.out.println(number+"THIS POSTION IS"+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,60,78,9,1,5,88,90,100};
		int key = 5;
		test obj = new test ();
		obj.sort(array);
		obj.search1(array);
		obj.sort1(array);
		System.out.println("AFTER BUBBLE SORT :"+Arrays.toString(array));
		System.out.println(key+"THIS POSTION IS"+obj.search(array,0,array.length,key));
        System.out.println("AFTER SELECTION SORT"+Arrays.toString(array));
	}

}
