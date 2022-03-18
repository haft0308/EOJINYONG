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
		System.out.print("입력하고자 하는 소문자값의 숫자를 작성하시오 : ");
		Scanner type = new Scanner(System.in);
		String str = type.next();//"ko"
		char ch = str.charAt(0);//위의 ko에서 0번째 k 만 추출한다 'k'
		System.out.println((char)(ch-32));//97-32=65 65는 아스키 코드로 대문자 a//98-32=66은 아스키 코드로 대문자B
		
		
		//int value = type.nextInt();
		//char value2 = (char)value;
		//char value3 = (char)(value-32);
		//System.out.print("입력받은 값은 소문자로 "+value2+"이며 이 소문자는 대문자로 "+value3+"입니다.");
		
		
		//p22
		int num = 5;
		if (num % 2 == 0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
		
		//p23
		int x = 10;
		int z = x-- + 5 + --x;
		System.out.println(x);
		System.out.println(z);
	}

}
