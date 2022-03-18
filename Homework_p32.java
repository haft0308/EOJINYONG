package homework;
import java.util.Scanner;
public class Homework_p32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아라 삼항연산을 if문을 사용하여 변경하시오
		//int x = -10;
		//int absX = x >= 0 ? x:-x;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x < 0)
		{
			System.out.println(x*-1);
		}
		else
		{
			System.out.println(x);
		}
		
	}

}
