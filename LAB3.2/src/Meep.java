import java.util.Arrays;

//Saurabh Bansal
public class Meep 
{
	/*public static int[] m(int[]L1, String[]L2) //Merge
	{
		
	}
	
	public static void MergeSort(int arr[],int l, int r)
	{
		
	}
	public static void main (String [] args)
	{
		String [] a = {"ashdf", "jhbfas" , "asufgaukdf" , "hsdf"};
		for (String y : a)
		{
			System.out.print(y + "," + " ");
		}
		mergeSort(a,1,1);
		System.out.println();
		for (String y : a)
		{
			System.out.print(y + "," + " ");
		}
		System.out.println();
		System.out.println();
		
	}
	static void mergeSort(String[] array, int low, int high)
	{
		if (low < high)
		{
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle + 1, high);
			merge(array, low, middle, high);
		}
	}
	static void merge (String array, int low, int middle, int high)
	{
		int[] helper = new int[array.length()];
		for (int i = low; i <= high; i++)
		{
			helper[i] = array [i];
		}
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		while (helperLeft <= middle && helperRight <= high)
		{
			if (helper[helperLeft] <= helper[helperRight])
			{
				array[current] = helper[helperLeft];
				helperLeft++;
			}
			else
			{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++)
		{
			array[current+i] = helper[helperLeft+i];
		}
	}
https://stackoverflow.com/questions/20795158/sorting-names-using-merge-sort
*/
	
	
	//Pre-Condition Both List1 and List2 contain Strings in alphabetical Order from a to Z
	public static void main (String[] args)
	{
	String []L1 = {"apple" , "banana", "microsoft", "zorro" , "cucumuber" , "cake"};
	String [] L2 = {"cherry" , "mahogany" , "oreos" , "pinata"};
	int [] L3 = {3,2,4,65,23,145,66,234,1234,6,24,53};
	
	//Merge Test
	long start = System.nanoTime();
	String[] mergeResult = merge(L1, L2);
	long end = System.nanoTime();
	long time = end - start;
	System.out.println();
	System.out.println(Arrays.toString(mergeResult));
	
	//Partition
	start = System.nanoTime();
	int pivotFinalPos = p(L3);
	end = System.nanoTime();
	time = end - start;
	System.out.println("Partition test took: " + time + " nanoseconds");
	System.out.println("Final Pivot Position: " + pivotFinalPos);
	System.out.println(Arrays.toString(L1));
	System.out.println("Merge test took:" + time + " nanoseconds");
	}
	
	public static String[] merge(String [] L1, String [] L2) 
	{
		String [] f = new String [(L1.length) + (L2.length)-1]; 
		int a = 0;
		int b = 0;
		int c = 0;
		while(b < L1.length && c < L2.length && a < f.length) 
		{
			if (L1[b].compareTo(L2[c]) >= 0)
			{
				f[a] = L2[c];
				a++;
				c++;
			}				
			else
			{
				f[a] = L1[b];
				a++;
				b++;
			}
		}
		return f;
	}
	
	public static int p(int[]L) //Partition
	{
		int B = L[0];    
	    int T = 0;
	    int n = 0;
	    int x = L.length -1;

	    for(int i = 1; i < L.length; i++)
	    {
	        if( L[i] <= (B))
	        {
	            swap(L, i, B);           
	            n = i;
	        } 
	        else if(L[i] > (B) && x > i)
	        {
	            T = L[i];
	            L[i] = L[x];
	            L[x] = T;
	            x = 1;
	            i--;
	        }
	    }
	    
	    System.out.println(java.util.Arrays.toString(L));
	    System.out.println(n);
	    return n;
	}
	private static void swap (int [] L , int i , int b)
	{
		int t = L[i];
		L[i] = L[b];
		L[b] = t;
	}
}
//https://github.com/SauravHoss/imsotired/blob/master/Lab3.2/src/tester.java
