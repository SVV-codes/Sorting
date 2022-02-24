import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		// input a unsorted array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++)
			array[i] = input.nextInt();
		input.close();

		// sort the array using Bubble Sort
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap array[j+1] and array[j]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

		// print the sorted array
		System.out.println("The sorted array is: ");
		for (int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
	}

}
