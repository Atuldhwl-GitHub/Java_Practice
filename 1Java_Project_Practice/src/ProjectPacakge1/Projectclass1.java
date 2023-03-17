package ProjectPacakge1;

public class Projectclass1 {
	
	public static void main(String[] args) 
	{
		
		int a = 56 ;
		int b = 960 ;
		int c = 230 ;
		int d = 410 ;
		
		System.out.println("Lets Start");	
		
		if(a>b)
		{	
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("A is largest " + a);
				}
				else
				{
					System.out.println("D is largest " + d);
				}	
			}
			else
			{
				if(c>d)
				{
					System.out.println("C is largest " + c);
				}
				else
				{
					System.out.println("D is largest " + d);
				}	
			}	
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("B is largest " + b);
				}
				else
				{
					System.out.println("D is largest " + d);
				}	
			}
			else
			{
				if(c>d)
				{
					System.out.println("C is largest " + c);
				}
				else
				{
					System.out.println("D is largest " + d);
				}	
			}	
		}	
		
		System.out.println("Lets End");	
				
	}
	
	
		
		
    }
