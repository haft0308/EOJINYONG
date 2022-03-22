package home_study;
import java.util.Scanner;
public class Study_0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int k = 0;
		for (k = 1; k<101; k++)
	    {
	    	if(k%2 == 0 )
	    	{
	    		System.out.print("\t");
	    		continue;
	    	}
	    	if(k%10 ==1)
	    	{
	    		System.out.println();
	    	}
	    	System.out.print(k);
	    }
		System.out.println();
		for(k = 1; k < 10; k++)
		{
		    System.out.println("3단=3*"+k+"="+3*k);		
		}
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구하고 싶은 단수를 입력하세요. : ");
		int input = sc.nextInt();
		
		for (k = 1 ; k < 10; k++)
		{
			System.out.println("입력받은 숫자의 단수 ="+input+"*"+k+"="+input*k);
		}
	}

}
