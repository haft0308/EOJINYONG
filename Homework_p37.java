package homework;

public class Homework_p37 {
	public static void main(String[] args) {
		
		
		int a = 0;
		a++;//
		System.out.println("월요일에 닭장에 있는 알의 개수는 :"+a);
		a++;//
		System.out.println("화요일에 닭장에 있는 알의 개수는 :"+a);
		a++;//
		System.out.println("수요일에 닭장에 있는 알의 개수는 :"+a);
		a++;//
		System.out.println("목요일에 닭장에 있는 알의 개수는 :"+a);
		a++;//
		System.out.println("금요일에 닭장에 있는 알의 개수는 :"+a);
		a++;//
		System.out.println("토요일에 닭장에 있는 알의 개수는 :"+a);
		a++;//
		System.out.println("일요일에 닭장에 있는 알의 개수는 :"+a);
		
		
		
		
		//위의 긴 문장을 for문으로 바꿔서 짧게 쓰는법
		int i = 0;
		for (i=0; i<7;i++)//i=0,i=1;
		{
			a++;
			System.out.println("닭장에 있는 알의 개수는 :"+a);
		}
	}

}
