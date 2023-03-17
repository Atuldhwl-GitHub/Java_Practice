package ProjectPacakge1;

public class Projectloops {
	
	public static void main(String[] args) {
		
		for (int b = 1 ; b <= 8 ; b++ ) // no of lines
		{
			for (int a = 1 ; a <= b ; a++) // star print
			{
				System.out.print("*");
			}
			System.out.println(); // line change
		}
		System.out.println(); // line change
		
		
		for (int b = 1 ; b <= 8 ; b++ ) // no of lines
		{
			for (int a = 8 ; a >= b ; a--) // star print
			{
				System.out.print("*");
			}
			System.out.println(); // line change
		}
		System.out.println(); // line change
		
		
		for (int b = 1 ; b <= 8 ; b++ ) // no of lines
		{
			for (int c = 8-1 ; c >= b ; c--) // space print
			{
				System.out.print(" ");
			}
			
			for (int a = 1 ; a <= b ; a++) // star print
			{
				System.out.print("*");
			}
			System.out.println(); // line change
		}
		System.out.println(); // line change
		
		for (int b = 1 ; b <= 8 ; b++ ) // no of lines
		{
			for (int c = 1 ; c < b ; c++) // space print
			{
				System.out.print(" ");
			}
			
			for (int a = 8 ; a >= b ; a--) // star print
			{
				System.out.print("*");
			}
			System.out.println(); // line change
		}
		System.out.println(); // line change
	}

}
