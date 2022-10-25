
public class Pattern4 {

	public static void main(String[] args) {
int n = 15;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) //Letter I
			{
				
				if(i==0 || i==(n-1) || j==(n-1)/2)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			for(int j =0; j<n/4;j++) //Space between letters
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) // Letter N
			{
				
				if((j==0)||(j==(n-1))|| (i==j))
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			for(int j =0; j<n/4;j++) //Space between letters
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) // Letter E
			{
				
				if(j==0 || i==0 || i==(n-1)/2 || i==(n-1))
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			for(int j =0; j<n/4;j++) //Space between letters
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) // Letter U
			{
				
				if((j==0 && i>=0 && i<(n-1)) ||(j==(n-1) && i>=0 && i<(n-1))||(i==(n-1) && j>0 && j<(n-1)))
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			for(int j =0; j<n/4;j++) //Space between letters
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) // Letter R
			{
				
				//if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i-j==(n-1)/2)
				if(j==0 || i==0 && j<(3*n)/4 || i==(n-1)/2 && j<(3*n)/4 || j==(3*n)/4 && i>0 && i<(n-1)/2 || i-j==(n/4) && i>(n-1)/2)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			for(int j =0; j<n/4;j++) //Space between letters
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) // Letter O
			{
				
				if(i==0 && j>0 && j<(3*n)/4 || i==(n-1) && j>0 && j<(3*n)/4 || j==0 && i>0 && i<n-1 || j==(3*n)/4 && i>0 && i<n-1)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			for(int j =0; j<n/4;j++) //Space between letters
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) // Letter N
			{
				
				if((j==0)||(j==(n-1))|| (i==j))
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
