package homework;

public class Homework_p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p24
		int num1 = 7, num2 = 7;
		int result1, result2;
		result1 = --num1 + 4;
		result2 = num2-- + 4;
		System.out.println("전위 감소 연산자에 의한 결과 :"+result1+", 변수의 값 : "+num1);
		System.out.println("후의 감소 연산자에 의한 결과 :"+result2+", 변수의 값 ; "+num2);
		
		//p26
		int a = 10, b = 20;
		System.out.println(a==b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		
		//p29
		byte flag1 = 0b00000001;
		byte flag2 = 0b00000010;
		byte flag3 = 0b00000100;
		byte flag4 = 0b00001000;
		
		byte result = 0b00000000;
		
		int flag5 = flag1;
		int flag6 = flag2;
		int flag7 = flag3;
		int flag8 = flag4;
		
		//flag1,2,3 값을 on 한다.
		result = (byte)(result|flag1);
		System.out.println(Integer.toBinaryString(result));
		System.out.printf( "%d%n" , flag5);
		
		result = (byte)(result|flag2);
		System.out.println(Integer.toBinaryString(result));
		System.out.printf( "%d%n" , flag6);
		
		result = (byte)(result|flag3);
		System.out.println(Integer.toBinaryString(result));
		System.out.printf( "%d%n" , flag7);
		
		//flag1의 값을 오프한다
		result = (byte)(result & ~flag1);
		System.out.println(Integer.toBinaryString(result));
		
		
		
		
		
		
		
	}

}
