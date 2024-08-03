import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		quick_sort(arr, 0, n - 1);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	private static void quick_sort(int[] arr, int low, int high) {

		if (low < high) {
			
			int pos = partition(arr, low, high);
					
			quick_sort(arr, low, pos - 1);
			quick_sort(arr, pos + 1, high);
		}


	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = select_pivot(arr, low, high);
		
		swap(arr, pivot, high);
		
		
		int i = low - 1;
		int j = low;
		
		while(j < high) {
			if(arr[j] < arr[high]) {
				++i;
				swap(arr, i , j);
			}
			++j;
		}
		
		swap(arr, i + 1, high);
		
		return i + 1;
	}

	private static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		
	}

	private static int select_pivot(int[] arr, int low, int high) {
		
		if(high - low <= 3) return high;
		
		int mid = (low + high)/2;
		
		int[] v = new int[] {arr[low], arr[mid], arr[high]};
		Arrays.sort(v);
		
		if(v[1] == arr[low]) return low;
		if(v[1] == arr[mid]) return mid;
		if(v[1] == arr[high]) return high;
		
		return 0;
	}


}