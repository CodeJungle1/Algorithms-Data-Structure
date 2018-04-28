package CodeJungle;

public class QuickSort {
	public int partition(int array[], int start, int end) {
		int pivot = array[end];
		int i = (start - 1);
		for (int j = start; j < end; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;
		return i + 1;
	}

	public void sort(int array[], int start, int end) {
		if (start < end) {
			int partitionElement = partition(array, start, end);
			sort(array, start, partitionElement - 1);
			sort(array, partitionElement + 1, end);
		}
	}

	public static void printArray(int array[]) {
		int arrayLength = array.length;
		for (int start = 0; start < arrayLength; ++start)
			System.out.print(array[start] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int array[] = { 4, 6, 3, 5, 1, 2 };
		int arrayLength = array.length;

		QuickSort quickSort = new QuickSort();
		quickSort.sort(array, 0, arrayLength - 1);

		System.out.println("Quick Sorted Array");
		printArray(array);
	}
}
