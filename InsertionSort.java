import java.util.*;

//Main method
public class InsertionSort {
public static int COMPCOUNT = 0;
	
	public static void main(String[] args)
    {
    	
		System.out.println("Enter the value of n :\n");
		Random rand = new Random();
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	int MAX_RAND_INT = n;
    	
    	for(int i = 0; i < n; i++)
    	{
    	arr[i] = rand.nextInt(MAX_RAND_INT);
    	
    	
    	}
    	System.out.println("The array for " + n +" elements are as follows:");
    	System.out.println(Arrays.toString(arr));
    	
        sc.close();
    	insertionSort(arr);
        
        
        // print the sorted array
    	
    	System.out.println("The sorted array for " + n + " elements are as follows:");
    	
        System.out.println(Arrays.toString(arr));
        
    }
    

















//Insertion Sort algorithm

public static void insertionSort(int[] arr) 
{
		
		
		for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i;
            
            
            while (j > 0 && arr[j - 1] > key)
            {
            	SMALLER(arr, i, j) ;
                arr[j] = arr[j - 1];
                j--;
                 
            }
            
            arr[j] = key;
        }
		System.out.println("No of key comparison " +COMPCOUNT);
    }
	
	


//Boolean Smaller method 
private static boolean SMALLER(int[] A, int i, int j)

 {
		COMPCOUNT++;
		if (A[i] < A[j])
 {
		return true;
	 }
		return false;
	 

}

		

    }

