//ROHIT GONSALO DSOUZA

//CS505 Section 852

//NJIT ID:31540870


public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = args.length == 1 ? Integer.parseInt(args[0]) : 1;

        for (int i = 1; i <= n; ++i) {
            int[] arr = Pascal.triangle(i);
            System.out.print((i < 10 ? " " : "") + i + ": ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Pascal 
{

    public static int[] triangle(int n)
    {
            int[] line; 
            if (n < 1) 
    	{    
                line = new int[0];
        } 
    	
	else if (n == 1)
    	 {      
                line = new int[] {1};
         } 
    	
	else 
    	{       
                int[] prev = triangle(n-1);
                line = new int[n];
                line[0] = 1;
                line[n-1] = 1;
                
               
                for (int j = 1; j < n-1; j++)
    		 {
                   line[j] = prev[j-1] + prev[j];

          	 }
         }
           
	 return line;
     }
    	
} 	
    	
    	
