package home_study;

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
		for(k = 0; k < 10; k++)
		{
		    System.out.println("3´Ü=3*"+k+"="+3*k);		
		}
	    
	}

}
