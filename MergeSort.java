public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int[] temp = new int[a.length];
		mergeSort(a, temp, 0, a.length - 1);

	}

	private static void mergeSort(int[] arr, int[] temp, int low, int high) {
		if (low >= high)
			return;
		// divide in half
		int mid = (low + high) / 2;
		mergeSort(arr, temp, low, mid);
		mergeSort(arr, temp, mid + 1, high);
		merge(arr, temp, low, mid, high);
	}

	public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
		int k = low;
		int i = low;
		int j = mid + 1;
		while (k <= high) {
			if (i > mid) {
				temp[k] = arr[j];
				k++;
				j++;
			} else if (j > high) {
				temp[k] = arr[i];
				k++;
				i++;
			} else if (arr[i] < arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}

		for (k = low; k <= high; k++)
			arr[k] = temp[k];
	}

}
