package homework;
import java.util.Scanner;
public class Homework_p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//P20
		char y = 'Y', R = 'r';
		System.out.println(y);
		System.out.println(R);
		
		//P21
		System.out.print("�Է��ϰ��� �ϴ� �ҹ��ڰ��� ���ڸ� �ۼ��Ͻÿ� : ");
		Scanner type = new Scanner(System.in);
		String str = type.next();//"ko"
		char ch = str.charAt(0);//���� ko���� 0��° k �� �����Ѵ� 'k'
		System.out.println((char)(ch-32));//97-32=65 65�� �ƽ�Ű �ڵ�� �빮�� a//98-32=66�� �ƽ�Ű �ڵ�� �빮��B
		
		
		//int value = type.nextInt();
		//char value2 = (char)value;
		//char value3 = (char)(value-32);
		//System.out.print("�Է¹��� ���� �ҹ��ڷ� "+value2+"�̸� �� �ҹ��ڴ� �빮�ڷ� "+value3+"�Դϴ�.");
		
		
		//p22
		int num = 5;
		if (num % 2 == 0)
		{
			System.out.println("¦��");
		}
		else
		{
			System.out.println("Ȧ��");
		}
		
		//p23
		int x = 10;
		int z = x-- + 5 + --x;
		System.out.println(x);
		System.out.println(z);
	}

}
