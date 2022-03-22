package home_study;
import java.util.Scanner;
public class Homework_while_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int a = 0;
		while(input <= 10 )
		{
			input = sc.nextInt();
			
			if(input == 0)
			{
		        break;
			}
			a++;
			
		}
		System.out.println(a+1);
		
//		int i = 1;
//		while(i<6)
//		{
//			System.out.println(i);
//			i++;
//		}
//		System.out.println(i);
		
	}

}
