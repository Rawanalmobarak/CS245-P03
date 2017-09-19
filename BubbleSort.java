
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {

		for (int pos = 0; pos < a.length - 1; pos++) {
			for (int j = a.length - 1; j > pos; j--) {
				if (a[j] < a[j - 1]) {
					// swap them
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
	}
}
