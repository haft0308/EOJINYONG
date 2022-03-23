package homework;
import java.util.Scanner;
public class Homestudy_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("1~10의 숫자를 입력하세요. 0을 입력하면 꺼집니다.");
		do
		{
			
			int input = sc.nextInt();
			if(input <= 10 && input > 0)
			{
				i++;
			}
			else if(input == 0)
			{
				System.out.println("0을 입력하셔서 종료합니다. 지금까지 입력받은 숫자의 개수는"+i+"개 입니다.");
				break;
			}
			else
			{
				System.out.println("잘못된 입력입니다.");
				
			}
		}while(true);
	}

}
