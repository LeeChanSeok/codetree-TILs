import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] arr, merge_arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];
		merge_arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		merge_sort(arr, 0, n - 1);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	private static void merge_sort(int[] arr, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			merge_sort(arr, low, mid);
			merge_sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}

	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int k = low;
		int i = low;
		int j = mid + 1;

		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j])
				merge_arr[k++] = arr[i++];
			else
				merge_arr[k++] = arr[j++];
		}

		while (i <= mid)
			merge_arr[k++] = arr[i++];
		while (j <= high)
			merge_arr[k++] = arr[j++];

		for (int l = low; l <= high; ++l) {
			arr[l] = merge_arr[l];
		}

	}
}