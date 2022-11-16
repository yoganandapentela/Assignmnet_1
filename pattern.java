package firstcode;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		//logic for I
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 ||i==n-1 || j==(n-1)/2 )
						
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			}
			System.out.print("  ");
			
		// logic for N
		for(int j=0;j<n;j++)
		{
			if(j==0 || i==j || j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.print("  ");
		
		//logic for E
		for(int j=0;j<n;j++)
		{
			if(i==0 || i==n-1 || j==0  || i==(n-1)/2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.print("  ");
		 // logic for U
		for(int j=0;j<n;j++)
		{
			if((j==0 && i!=n-1) || (j==n-1 && i!=n-1 )|| (i==(n-1)&& j>0 && j<(n-1)))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
	
			}
		}
		System.out.print("  ");
		
		// logic for R
		
		for(int j=0;j<n;j++)
		{
			if(j==0 || (i==0 && j<(n-1)/2)  || (i==(n-1)/2  && j<(n-1)/2)  || (j==(n-1)/2 && i>0 && i<(n-1)/2 ) || i-j==(n-1)/2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
	
			}
		}
		System.out.print("");
		
		// logic for O
		for(int j=0;j<n;j++)
		{
			if(i==0  || i==n-1 || j==0 ||j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
	
			}
		}
		System.out.print("  ");
		
		
		// logic for N
		for(int j=0;j<n;j++)
		{
			if(j==0 || i==j || j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
	
		System.out.println();
		}

	}

}
