package homework;
import java.util.Scanner;
public class Homestudy_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("1~10�� ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� �����ϴ�.");
		do
		{
			
			int input = sc.nextInt();
			if(input <= 10 && input > 0)
			{
				i++;
			}
			else if(input == 0)
			{
				System.out.println("0�� �Է��ϼż� �����մϴ�. ���ݱ��� �Է¹��� ������ ������"+i+"�� �Դϴ�.");
				break;
			}
			else
			{
				System.out.println("�߸��� �Է��Դϴ�.");
				
			}
		}while(true);
	}

}
