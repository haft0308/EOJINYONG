package homework;

public class ERERERER {
	public static void main(String[] args) {
		
		int a = 5;
		char b = (char)5;
		int c = (int)b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		byte flag1 = 0b00000001;
		byte flag2 = 0b00000010;
		byte flag3 = 0b00000100;
		byte flag4 = 0b00001000;
		
		byte result = 0b00000000;
		byte result1 = 0b00000000;
		//flag1,2,3 값을 on 한다.
		result = (byte)(result|flag1);
		System.out.println(Integer.toBinaryString(result));
				
				
		result = (byte)(result|flag2);
		System.out.println(Integer.toBinaryString(result));
			
				
		result = (byte)(result|flag3);
		System.out.println(Integer.toBinaryString(result));
			
				
				//flag1의 값을 오프한다
		result1 = (byte)(result1 & ~flag1);
		System.out.println(Integer.toBinaryString(result1));
				
	}
}
