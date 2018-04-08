package CodeJungle;

public class BubbleSort {

	public void bubbleSort(int array[]) {
		int length = array.length;
		for (int i = 0; i < length - 1; i++)
			for (int j = 0; j < length - i - 1; j++)
				if (array[j] > array[j + 1]) {
					int tempElement = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tempElement;
				}
	}

	void printArray(int array[]) {
		int length = array.length;
		for (int i = 0; i < length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		BubbleSort bubbleSort = new BubbleSort();
		int array[] = { 64, 34, 25, 12, 22, 11 };
		bubbleSort.bubbleSort(array);
		System.out.println("Sorted array");
		bubbleSort.printArray(array);
	}
}
