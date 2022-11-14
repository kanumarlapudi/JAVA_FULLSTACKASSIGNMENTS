
public class Harish_Pattern {
public static void main(String args[])
	
	{
	      int i,j,n=10;
	      
	      //Pattern for H
	      for(i=0;i<n;i++)
	      {
	    	  for(j=0;j<n;j++)
	    	  {
	    		  if(j==0 || j==n-2 || i==(n-1)/2 && j!=n-1) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
	    	  }
	    	  
	    	//Pattern for A
	    	  for(j=0;j<n;j++)
	    	  {
	    		  if((j==0 && i!=0) || j==n-2 && i!=0 || (i==0 && j!=0 && j<n-2) || i==(n-1)/2 && j!=n-1) 
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
	    	  
	    	//Pattern for S
	    	  for(j=0;j<n;j++)
	    	  {
	    			  
	    		  if(i==0 && j!=0 && j<=n-2 || j==0 && i!=0 && i<(n-1)/2 || i==(n-1)/2 && j!=0 && j<n-2  ||
	    		          j==n-2 && i>(n-1)/2 && i!=n-1 || i==n-1 && j<n-2 )
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
	    	  }
	    	  for(j=0;j<n;j++)
	    	  {
	    		  if(j==0 || j==n-2 || i==(n-1)/2 && j!=n-1) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  else
	    		  {
	    			  System.out.print(" ");
	    		  }
	    	  }
	    	  
	    	  
	    	  System.out.println("");
	      }
	}


}
