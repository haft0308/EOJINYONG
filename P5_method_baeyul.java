package hamsu;

public class P5_method_baeyul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,3,4,5};
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		
		max = makemax(arr1);
		System.out.println(max);
		sum = makesum(arr1);
		System.out.println(sum);
		avg = makeavg(arr1);
		System.out.println(avg);
	}
	static int makemax (int[] a)
	{
		int i = 0;
		int max = 0;
		for(i = 0; i < a.length; i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		return max;
	}
	static int makesum (int[]a)
	{
		int i = 0;
		int sum = 0;
		for(i = 0; i < a.length; i++)
		{
			sum = sum+a[i];
		}
		return sum;
	}
	static float makeavg (int[]a)
	{
		int i = 0;
		float avg = 0.0f;
		int max = 0;
		for(i = 0; i < a.length; i++)
		{
			max = max + a[i];
			avg = max / a.length;
		}
		return avg;
	}
	
}
