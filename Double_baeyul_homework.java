package chapter5baeyul;

public class Double_baeyul_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5행5열의 배열 1열 부터 5열까지 1~5를 넣기
		int i = 0; int j = 0; int k = 0;
//		int [][] num = new int [5][5];
		
//		for (i = 0; i < num.length; i++)
//		{
//			k++;
//			for(j = 0; j< num.length; j++)
//			{
//			    num[i][j] = k;
//			    System.out.print(num[i][j]+"\t");
//			}
//			System.out.println();
//		}
		

		
		
		
		
//		for (i = 0; i < num.length; i++)
//		{
//			
//			for(j = 0; j< num.length; j++)
//			{
//				k++;
//				num[j][i] = k;
//				System.out.print(num[j][i]+"\t");
//				if(k == 5)
//				{
//					k = 0;
//				}
//			}
//			System.out.println();
//			
//		}
		
//		int p = 0;
//		for(i = 0; i < num.length; i++)
//		{
//			k++;
//			for(j = 0; j < num.length; j++)
//			{
//				
//				num[i][j] = k+p;
//				p = p+5;
//				System.out.print(num[i][j]+"\t");
//			}
//			System.out.println();
//		}
		int p = 0;
		int [][] num2 = new int [5][5];
	
		
		
		
		
		///역 삼각형
//		for (i = 4; i >= 0; i-- )
//		{
//			
//			for( j = 0; j < 5 ; j++ )
//			{
//				p++;
//			    num2[j][i] = p;
//				System.out.print(num2[i][j]);
//			}
//			
//			System.out.println();
//		}
//		System.out.println();
		//삼각형
		for (i = 0; i  < 5; i++ )
		{
			
			for( j = 0; j < 5 ; j++ )
			{
				p++;
			    num2[j][i] = p;
				System.out.print(num2[i][j]);
			}
			
			System.out.println();
		}
	}

}
