package home_study;
import java.util.Scanner;
public class Study_0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int k = 0;
//		for (k = 1; k<101; k++)
//	    {
//	    	if(k%2 == 0 )
//	    	{
//	    		System.out.print("\t");
//	    		continue;
//	    	}
//	    	if(k%10 ==1)
//	    	{
//	    		System.out.println();
//	    	}
//	    	System.out.print(k);
//	    }
//		System.out.println();
//		for(k = 1; k < 10; k++)
//		{
//		    System.out.println("3단=3*"+k+"="+3*k);		
//		}
//	    
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("구하고 싶은 단수를 입력하세요. : ");
//		int input = sc.nextInt();
//		
//		for (k = 1 ; k < 10; k++)
//		{
//			System.out.println("입력받은 숫자의 단수 ="+input+"*"+k+"="+input*k);
//		}
//		
		
	    
	    
	    int i = 0;
		int j = 1;
		
		for (i = 2; i < 10; i++)
		{
		    for(k = 1; k < 10; k++  )
		    {
		    	System.out.print(i+"*"+k+"="+i*k+"\t");
		    }
		    System.out.println();
		}
		System.out.println();
		for (i = 1; i < 10; i++)
		{
		    for(k = 2; k < 10; k++  )
		    {
		    	System.out.print(k+"*"+i+"="+i*k+"\t");
		    }
		    System.out.println();
		}
		

		

	    }	
	    
		
	}


