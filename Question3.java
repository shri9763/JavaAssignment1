package in.ineuron.assign;


public class Question3 {
	public static void main(String[] args) {
		int n=9;
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				  if(i==n-1||j==0||j==n-1||i==0||i+j<=(n-1)/2||j-i>=(n-1)/2)
				  {
					  System.out.print("* ");
				  }
				  else
				  {
					  System.out.print("  ");
				  }
			  }
			  System.out.println();
		  }
	}

}
