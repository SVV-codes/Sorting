import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		// input a unsorted array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int  i = 0 ; i<n ; i++)
		{
			array[i] = input.nextInt();
		}
		input.close();

		// sort the array 
		

		// print the sorted array
		System.out.println("The sorted array is: ");
		for(int i = 0 ; i<n ; i++)
		{
			System.out.print(array[i] + " ");
		}
	}

}
