
public class Ineuron_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,n=10;
		
		for(i=0;i<n;i++)
		{
			//Pattern for I
			for(j=0;j<n;j++)
			{
				if(i==0 && j<n-1 || j==(n-1)/2 || i==n-1 && j<n-1 ) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
			}
			
			//Pattern for N
			for(j=0;j<n;j++)
			{
				if(j==0 || j==n-2 || i-1==j ) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
			}
			
			//Pattern for E
			for(j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<n-2 || i==(n-1)/2 && j<n-2 || i==n-1 && j<n-2) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
			}
			
			//Pattern for U
			for(j=0;j<n;j++)
			{
				if(j==0 && i!=n-1 || j==n-2 && i!=n-1 || i==n-1 && j!=0 && j<n-2 ) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
			}
			
			//Pattern for R
	    	  for(j=0;j<n;j++)
	    	  {
	    		  if(j==0 || i==0 && j<n-2 || j==n-2 && i!=0 && i<(n-1)/2 || i==(n-1)/2 && j!=n-1 && j!=n-2 || 
	    				  i==j && j>(n-1)/2 && j<=n-2) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
	    	  }
	    	  
	    	//Pattern for O
				for(j=0;j<n;j++)
				{
					if(j==0 && i!=n-1 && i!=0 || i==n-1 && j!=0 && j<n-2 || j==n-2 && i!=0 && i!=n-1 || 
							i==0 && j!=0 && j<n-2) 
		    		  {
		    			  System.out.print("*");
		    		  }
		    		  else
		    		  {
		    			  System.out.print(" ");
		    		  }
				}
				
				//Pattern for N
				for(j=0;j<n;j++)
				{
					if(j==0 || j==n-2 || i-1==j ) 
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
