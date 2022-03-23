package homework;

public class Homework_baeyul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[5] ;
		int a = 0;
		int b = 0;
		for (a = 0; a <= 40; a=a+10)
		{
			System.out.println("score["+b+"] = "+a);
			score[b++] = a;			
		}
		System.out.println(score[4]);
		byte arrByte[] = new byte[]{0,1,2,3,4};
		arrByte[0] = 1;
		arrByte[1] = 2;
		arrByte[2] = 3;
		arrByte[3] = 4;
		arrByte[4] = 5;
		
		char arrChar[] = new char[] {0,1,2,3,4};
		arrChar[0] = 'A';
		arrChar[1] = 'B';
		arrChar[2] = 'C';
		arrChar[3] = 'D';
		arrChar[4] = 'E';
		
		boolean arrBoolean[] = new boolean[5];
		arrBoolean[0] = false;
		arrBoolean[1] = true;
		arrBoolean[2] = false;
		arrBoolean[3] = true;
		arrBoolean[4] = false;
		
		short arrShort[] = new short[] {0,1,2,3,4};
		arrShort[0] = 100;
	    arrShort[1] = 200;
	    arrShort[2] = 300;
	    arrShort[3] = 400;
	    arrShort[4] = 500;
	    
	    long arrLong[] = new long[] {0,1,2,3,4};
	    arrLong[0] = 90;
	    arrLong[1] = 135;
	    arrLong[2] = 180;
	    arrLong[3] = 225;
	    arrLong[4] = 270;
	    
	    float arrFloat[] = new float[] {0,1,2,3,4};
	    arrFloat[0] = 3.14f;
	    arrFloat[1] = 6.28f;
	    arrFloat[2] = 9.42f;
	    arrFloat[3] = 12.56f;
	    arrFloat[4] = 15.700001f;
	    
	    System.out.println(arrFloat[4]);
	    
	    double arrDouble[] = new double[] {0,1,2,3,4};
	    arrDouble[0] = 3.141592d;
	    arrDouble[1] = 3.141592d;
	    arrDouble[2] = 3.141592d;
	    arrDouble[3] = 3.141592d;
	    arrDouble[4] = 3.141592d;
	    
	    
	}

}
