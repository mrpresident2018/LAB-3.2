//Saurabh Bansal
public class Meep 
{
	//Pre-Condition Both List1 and List2 contain Strings in alphabetical Order from a to Z
	/*public static int[] m(int[]L1, String[]L2) //Merge
	{
		
	}
	public static int p(int[]L) //Partition
	{
		
	}
	public static void MergeSort(int arr[],int l, int r)
	{
		
	}*/
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
	/*static void merge (String array, int low, int middle, int high)
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
	}*/
// https://stackoverflow.com/questions/20795158/sorting-names-using-merge-sort



}
