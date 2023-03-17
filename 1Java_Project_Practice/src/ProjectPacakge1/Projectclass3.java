package ProjectPacakge1;

public class Projectclass3 {
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		
			for (int a = 1 ; a<5 ; a++)
			{
				System.out.println();
				
					for (int b = 1 ; b<7 ; b++)
					{
						System.out.print("*");
					}
						
					
			}
			System.out.println();
			System.out.println();
		System.out.println("End");
		
		int line = 8 ;
		for (int b = 1 ; b <= line ; b++)
		{
			for (int a = (line-1) ; a >= b ; a--)
			{
				System.out.print(" ");
			}
			for (int c = 1 ; c <= b ; c++)
			{
				System.out.println("*");
			}
			
			System.out.println();
	}
	
	
	}
}

