package homework;
import java.util.Scanner;
public class Ex_baeyul_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[] { 36,34,667,2436,34435,7678,32434};
		//���� ū ���� ����غ�����
		int max = -1;
		int index = 0;
		for (int i = 0 ; i < 7 ; i++ )
		{
			if ( max < num[i])
			{
				max = num[i];
				index = i;
			}
			else
			{
				
			}
		}
		System.out.println(max);
		System.out.println(index);
		
		
		
		//����ڷκ��� �Է¹��� �� �� ���� ū ���� ����� ������.
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		int number [] = new int [10];
//		int i = 0;
//		System.out.println("�迭�� �� ���� ���� �Է��� �ּ���.");
//		
//		for (i = 0; i < 10; i++)
//		{
//			number[i] = input = sc.nextInt();
//		}
//		
//		for ( i = 0; i < 10; i++ )
//		{
//			if(number[i] > max)
//			{
//			    max = number[i];
//			    index = i;
//			}
//		}
//		System.out.println(max);
//		System.out.println(index);
	}

}
