package ProjectPacakge1;

public class Projectclass4 {
	
	public static void main(String[] args)
	{
		int line = 8;
		
		for (int b = 1 ; b <= 8 ; b++)
		{
			for (int a = 1 ; a <= b ; a++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for (int d = 8 ; d >= 1 ; d--)
		{
			for (int c = 1 ; c <= d ; c++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		for (int d = 1 ; d <= line ; d++)
		{
			for (int c = (line-1) ; c >= d ; c--)
			{
				System.out.print(" ");
			}
			for (int e = 1 ; e <= d ; e++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for (int d = line ; d >= 1 ; d--)
		{
			for (int c = (line-1) ; c >= d ; c--)
			{
				System.out.print(" ");
			}
			for (int e = 1 ; e <= d ; e++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for (int d = 1 ; d <= line ; d++)
		{
			for (int c = (line-1) ; c >= d ; c--)
			{
				System.out.print(" ");
			}
			for (int e = 1 ; e <= d ; e++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		for (int d = 0 ; d < line ; d++)
		{
			for (int c = (line-1) ; c > d ; c--) //  space
			{
				System.out.print(" ");
			}
			for (int e = 0 ; e < (2*d+1) ; e++) // star
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		for (int e = 1 ; e <= 5 ; e++) // colum
		{
			for ( int c = 1 ; c <= 5 ; c++) // row
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
}
